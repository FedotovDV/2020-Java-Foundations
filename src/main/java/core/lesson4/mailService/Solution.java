package core.lesson4.mailService;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.*;
import core.lesson4.mailService.Main.*;
import core.lesson4.mailService.Main.Package;

public class Solution {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) throws UnsupportedEncodingException {

        Logger logger = Logger.getLogger(Solution.class.getName());
        logger.setLevel(Level.INFO);
        Inspector inspector = new Inspector();
        Spy spy = new Spy(logger);
        Thief thief = new Thief(10000);
        MailService variousWorkers[] = new MailService[]{spy, thief, inspector};
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(variousWorkers);
        Package pack1 = new Package("ВВЖ", 32);
        Package pack2 = new Package("рпакетный двигатель ", 2500000);
        Package pack3 = new Package("stones", 1000);
        Package pack4 = new Package("banned substance", 99);
        Package pack5 = new Package("tiny bomb", 9000);
        AbstractSendable correspondence[] = {
                new MailMessage("Oxxxymiron", "Гнойный", "Я здесь чисто по фану, поглумиться над слабым\n" +
                        "Ты же вылез из мамы под мой дисс на Бабана...."),
                new MailMessage("Гнойный", "Oxxxymiron", "....Что? Так болел за Россию, что на нервах терял ганглии.\n" +
                        "Но когда тут проходили митинги, где ты сидел? В Англии!...."),
                new MailMessage("Жриновский", AUSTIN_POWERS, "Бери пацанов, и несите меня к воде."),
                new MailMessage(AUSTIN_POWERS, "Пацаны", "Го, потаскаем Вольфовича как Клеопатру"),
                new MailPackage("берег", "море", pack1),
                new MailMessage("NASA", AUSTIN_POWERS, "Найди в России ракетные двигатели и лунные stones"),
                new MailPackage(AUSTIN_POWERS, "NASA", pack2),
                new MailPackage(AUSTIN_POWERS, "NASA", pack3),
                new MailPackage("Китай", "КНДР", pack4),
                new MailPackage(AUSTIN_POWERS, "ИГИЛ (запрещенная группировка", pack5),
                new MailMessage(AUSTIN_POWERS, "Психиатр", "Помогите"),
        };
        Arrays.stream(correspondence).forEach(parcell -> {
            try {
                worker.processMail(parcell);
            } catch (StolenPackageException e) {
                logger.log(Level.WARNING, "Inspector found stolen package: " + e);
            } catch (IllegalPackageException e) {
                logger.log(Level.WARNING, "Inspector found illegal package: " + e);
            }
        });

        System.out.println(thief.getStolenValue());
    }

}
