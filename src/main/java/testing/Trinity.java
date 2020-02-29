package testing;

import java.util.Objects;

public class Trinity implements Comparable<Trinity> {

    private String firstElement;
    private String secondElement;
    private String thirdElement;

    public Trinity(String[] arrayString){
        if(arrayString.length == 3) {
            this.firstElement = arrayString[0].replaceAll("\\W", "");
            this.secondElement = arrayString[1].replaceAll("\\W", "");
            this.thirdElement = arrayString[2].replaceAll("\\W", "");
        }
    }

    public String getFirstElement() {
        return firstElement;
    }
    public String getSecondElement() {
        return secondElement;
    }
    public String getThirdElement() {
        return thirdElement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trinity)) return false;
        Trinity trinity = (Trinity) o;
        return getFirstElement().equals(trinity.getFirstElement()) &&
                getSecondElement().equals(trinity.getSecondElement()) &&
                getThirdElement().equals(trinity.getThirdElement());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstElement(), getSecondElement(), getThirdElement());
    }

    @Override
    public String toString() {
        return "\"" + firstElement + "\"; \"" + secondElement + "\"; \"" + thirdElement + "\"\n";
    }

    @Override
    public int compareTo(Trinity t) {
        if((!t.firstElement.isEmpty())&&(this.firstElement.equals(t.firstElement)) ||
                (!t.secondElement.isEmpty())&& (this.secondElement.equals(t.secondElement))||
                (!t.thirdElement.isEmpty())&&(this.thirdElement.equals(t.thirdElement))){
            return 0;
        }
        return -1 ;
    }
}
