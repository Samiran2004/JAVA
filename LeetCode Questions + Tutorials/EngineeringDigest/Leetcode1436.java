import java.util.*;

class Leetcode1436 {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();

        paths.add(List.of("London", "New York"));
        paths.add(List.of("New York", "Lima"));
        paths.add(List.of("Lima", "Sao Paulo"));
        
        System.out.println("Destination: "+ destCity(paths));
    }
    private static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet();
        for(List<String> path: paths) {
            set.add(path.get(0));
        }
        for(List<String> path: paths) {
            if(!set.contains(path.get(1))){
                return path.get(1);
            }
        }
        return null;
    }
}