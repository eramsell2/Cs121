package WeekNine;

public class movies {
        private String genre;
        private String title;
        private int runtime;

        private static int instanceCount = 0;

        //default constructor
        public movies(){
            instanceCount ++;

        }

        public movies(String genre, String title, int runtime){
            this.genre = genre;
            this.title = title;
            this.runtime = runtime;
            //increments instance
            instanceCount ++;
        }

        //setters and getters
        public void setGenre(String genre){
            this.genre = genre;
        }
        public void setTitle(String title){
            this.title = title;
        }
        public void setRuntime(int runtime){
            this.runtime = runtime;
        }

        public String getGenre(){
            return genre;
        }
        public String getTitle(){
            return title;
        }
        public int getRuntime(){
            return runtime;
        }
        //static method
        public static int getInstanceCount(){
            return instanceCount;

        }

    }





