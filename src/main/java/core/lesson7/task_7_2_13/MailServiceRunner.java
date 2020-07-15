package core.lesson7.task_7_2_13;


import java.util.*;
import java.util.function.Consumer;

public class MailServiceRunner {

    public static void main(String[] args) {
        // Random variables
        String randomFrom = "randomFrom"; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "randomTo";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

// Создание списка из трех почтовых сообщений.
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );

// Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом(Consumer<? super MailMessage>)
        messages.stream().forEachOrdered(mailService);

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox();

        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ) : "wrong mailService mailbox content (1)";

        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ) : "wrong mailService mailbox content (2)";

        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()) : "wrong mailService mailbox content (3)";


// Создание списка из трех зарплат.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

// Создание почтового сервиса, обрабатывающего зарплаты.
        MailService<Integer> salaryService = new MailService<>();

// Обработка списка зарплат почтовым сервисом (Consumer<? super Salary>)
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();


        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)) : "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)) : "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)) : "wrong salaries mailbox content (3)";
    }


    public static class MailMessage extends AbstractSendable<String> {
        private final String content;

        public MailMessage(String from, String to, String content) {
            super(from, to);
            this.content = content;
        }

        @Override
        public String getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            MailMessage that = (MailMessage) o;
            return Objects.equals(getContent(), that.getContent());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getContent());
        }

    }

    public static class Salary extends AbstractSendable<Integer> {
        private final Integer content;

        public Salary(String from, String to, Integer content) {
            super(from, to);
            this.content = content;
        }

        @Override
        public Integer getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Salary salary = (Salary) o;
            return Objects.equals(getContent(), salary.getContent());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getContent());
        }

    }

    public static class MailService<T> implements Consumer<Sendable<T>> {

        private Map<String, List<T>> mailBox;

        public MailService() {
            mailBox = new HashMap<String, List<T>>() {
                @Override
                public List<T> get(Object key) {
                    return super.getOrDefault(key, new ArrayList<>());
                }
            };

        }

        public Map<String, List<T>> getMailBox() {
            return mailBox;
        }

        @Override
        public void accept(Sendable<T> sendable) {
            List<T> contentList = mailBox.get(sendable.getTo());
            contentList.add(sendable.getContent());
            mailBox.put(sendable.getTo(), contentList);
        }
    }


    public static interface Sendable<T> {
        String getFrom();

        String getTo();

        T getContent();

    }


    public static abstract class AbstractSendable<T> implements Sendable<T> {
        protected final String from;
        protected final String to;


        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public abstract T getContent();


    }

}
