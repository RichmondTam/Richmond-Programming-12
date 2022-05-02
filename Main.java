import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;
    public static int key;
    public static LinkedList<Integer> nodes;

    public static ArrayList<Integer> points;



    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS(1);
    }

    private static void BFS(int x) {

        LinkedList<Integer> queue= new LinkedList<>();
        boolean visited;                                
        visited =true;
        queue.add(x);

        while(queue.size()!=0){
            s=queue.poll();
            System.out.println(x+" ");
            Iterator<Node> i = graph.listIterator();
            while (i.hasNext())
            {
                Node n = i.next();
                if (!visited)
                {
                    visited = true;             //change non-visited to visited
                    queue.add(n.getKey());      //add the number to the queue
                }
            }
        }

    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("/Users/richmond/Downloads/Module3.3Graphs/tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }




}
