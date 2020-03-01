package testing.forWork.group;

import java.util.*;

public class Group {

    private List<Trinity> group;

    public Group(ArrayList<Trinity> group) {
        this.group = group;
    }

    public List<Trinity> getGroup() {
        return group;
    }

    public int size() {
        return group.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group1 = (Group) o;
        return group.equals(group1.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Trinity trinity : group) {
            str.append(trinity).append("\n");
        }
        return str.toString();
    }
}
