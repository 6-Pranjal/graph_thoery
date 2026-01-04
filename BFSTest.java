import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class BFSTest {

  @Test
  void testBFSTraversalFromSourceZero() {
    ArrayList<BFS.Edge>[] graph = BFS.createGraph();

    List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
    List<Integer> actual = BFS.bfsTraversal(graph, 0);

    assertEquals(expected, actual);
  }
}
