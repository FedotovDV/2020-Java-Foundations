package testing.forWork.group;


import testing.forWork.columnEnum.ColumnOrder;

import java.util.*;
import java.util.stream.Collectors;

public class Trinity  {
    private List<Entity> entities = new ArrayList<>();

    public Trinity (String... strings) {
        for (ColumnOrder columnOrder : ColumnOrder.values()) {
            entities.add(new Entity(columnOrder, strings[columnOrder.getValue()]));
        }
    }

    public Entity getEntity(ColumnOrder columnOrder) {
        return entities.get(columnOrder.getValue());
    }

    public List<Entity> getLegitEntities() {
        return entities.stream().filter(Entity::isLegit).collect(Collectors.toList());
    }

    public boolean isLegit() {
        for (Entity entity : entities) {
            if(entity.isLegit()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trinity that = (Trinity) o;
        return entities.equals(that.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(";");
        for (Entity entity : entities)
            joiner.add(entity.toString());
        return joiner.toString();
    }

}
