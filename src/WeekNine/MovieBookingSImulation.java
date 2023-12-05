package WeekNine;

public class MovieBookingSImulation {
    public static void main(String[] args) {
        int [][] theatre = new int[5][10];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <10; j++){
                theatre[i][j] = 0;
            }
        }
        String [][] movies = {
                {"Star Wars", "2D", "5", "10$"},
                {"Inception", "3D", "4", "12$"},
                {"Downfall", " 2D", "10", "8$"}
        };
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%d", theatre[i][j]);
            }
            System.out.println();
        }
        for (String[] movieRow : movies) {
            for (String movieDetail : movieRow) {
                System.out.print(movieDetail + " ");
            }
            System.out.println();
        }

        theatre[0][1] = 1;
        theatre[0][3]= 1;
        theatre[2][3] = 1;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%d", theatre[i][j]);
            }
            System.out.println();
        }


    }
}
