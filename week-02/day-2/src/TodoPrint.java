public class TodoPrint {
    public static void main(String... args){
        String myTodo = "My todo:\n";
        String games = "- Download games\n";
        String diablo= "- Diablo\n";
        String todoText = myTodo + " - Buy milk\n" + games.indent(1) + diablo.indent(5);

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

//         My todo:
//          - Buy milk
//          - Download games
//              - Diablo

        System.out.println(todoText);
    }
}
