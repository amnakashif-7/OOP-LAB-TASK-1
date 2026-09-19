public class AIExperimentDemo {

   
    static void updateProgress(AIExperiment exp) {
        exp.runEpochs(5);
    }

    public static void main(String[] args) {
      
        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "MNIST Classifier";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "LLM Fine-Tune";
        exp2.completedEpochs = 20;
        exp2.targetEpochs = 100;

       
        System.out.println(" Initial States ");
        System.out.println(exp1.status());
        System.out.println(exp2.status());


        exp1.runEpochs(5);
        exp2.runEpochs(10, 5);


        System.out.println("\n After Running Epochs ");
        System.out.println(exp1.status() + " | Remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.status() + " | Remaining: " + exp2.remainingEpochs());

        
        System.out.println("\n Helper Method Mutation ");
        System.out.println("Before update: " + exp1.status());
        updateProgress(exp1);
        System.out.println("After update: " + exp1.status());
    }
}