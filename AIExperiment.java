class AIExperiment {
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // Increases completed epochs
    void runEpochs(int epochs) {
        completedEpochs += epochs;
    }

    // Overloaded method to include bonus epochs
    void runEpochs(int epochs, int bonusEpochs) {
        completedEpochs += (epochs + bonusEpochs);
    }

    // Calculates remaining epochs using a local variable
    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs;
        return remaining;
    }

    // Returns readable single-line status
    String status() {
        return "Experiment: " + experimentName + " | Progress: " + completedEpochs + "/" + targetEpochs + " Epochs";
    }
}