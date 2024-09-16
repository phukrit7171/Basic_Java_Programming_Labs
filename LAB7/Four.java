import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbe of students : ");
        String[] subjects = {"Physics","Biology","Chemistry"};
        double[][] scores = new double[Integer.parseInt(sc.nextLine())][subjects.length];

        int[] sum_each_student = new int[scores.length],avg_each_student = new int[scores.length];
        double[] sum_each_subject = new double[subjects.length] ,avg_each_subject = new double[subjects.length];


        for(int student = 0; student  < scores.length; student ++){
            for (int subject = 0 ; subject < scores[student].length ; subject++){
                System.out.printf("Enter the %d student %s score : ",student+1 ,subjects[subject]);
                scores[student][subject] = Double.parseDouble(sc.nextLine());
            }
        }

        for(int student = 0; student  < scores.length; student ++){
            for (int subject = 0 ; subject < scores[student].length ; subject++){
                sum_each_student[student] += scores[student][subject];
                sum_each_subject[subject] += scores[student][subject];

                avg_each_student[student] = sum_each_student[student]/scores[student].length;
                avg_each_subject[subject] = sum_each_subject[subject]/scores.length;
            }

        }

        System.out.println("Physics, Biology, Chemistry | Total | Average");
        for (int student = 0 ; student < scores.length ; student++){
            System.out.printf("Student %d : ",student+1);
            for(int subject = 0 ; subject < scores[student].length ; subject++){
                System.out.print(scores[student][subject]+" " );
            }
            System.out.println("| "+sum_each_student[student]+" | " + avg_each_student[student]);
        }
        System.out.println("----------------------------");
        System.out.println("Average scores for Physics, Biology, and Chemistry");
        for (double subject : avg_each_subject) {
            System.out.print(subject+" ");
        }
        System.out.println("\n----------------------------");
        
        for (int student = 0 ; student < scores.length ; student++){
            System.out.printf("Student %d : ",student+1);
            for (int subject = 0 ; subject < scores[student].length ; subject++){
                System.out.print(((scores[student][subject] > avg_each_subject[subject])? "Pass ":"No "));
            }
            System.out.println();
        }
        sc.close();
    }
}