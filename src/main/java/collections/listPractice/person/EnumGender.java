package collections.listPractice.person;

public enum EnumGender {
    MALE("male"), FEMALE("female");

    private final String gender;

    EnumGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
