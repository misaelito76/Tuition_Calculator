public class App {
    public static void main(String[] args) throws Exception {
double tuition=10000;
double fee=.05;
double fourYearsT=0;
for (int i = 1; i <=14; i ++){
    tuition+=tuition*fee;
    if(i==10){
        System.out.printf("The tuition in ten years will be :"+"%5.0f",tuition);
    }
    if(i>10){
        fourYearsT+=tuition;
    }
}
System.out.println();
        System.out.printf("The tuition in four years after the tenth will be :"+"%5.0f",fourYearsT);




}
}
