public class latihan {
    public static void main(String[] args) {
        String[] myhobby = {"makan", "nyanyi", "game"};

        System.out.println("my hooby :" +myhobby[0]);
        System.out.println("my hooby :" +myhobby[1]);
        System.out.println("my hooby :" +myhobby[2]);


        System.out.println("======");
        int y = 0;
        do {
            System.out.println("my hobbi :" +myhobby[y]);
            y++;
        }while (y < myhobby.length);
    }
}
