package Part1;

import java.util.Collection;

public interface Node {

    public Collection<Node> getCollection(Class<? extends HasUUID> object);

}
