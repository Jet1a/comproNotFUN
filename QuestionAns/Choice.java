package QuestionAns;

public class Choice {
    private int choiceNo;
    private String choiceItem;

    public Choice() {
    }

    public Choice(int choiceNo, String choiceItem) {
        this.choiceNo = choiceNo;
        this.choiceItem = choiceItem;
    }

    public void setChoiceNo(int choiceNo) {
        this.choiceNo = choiceNo;
    }

    public void setChoiceItem(String choiceItem) {
        this.choiceItem = choiceItem;
    }

    public int getChoiceNo() {
        return choiceNo;
    }

    public String getChoiceItem() {
        return choiceItem;
    }

    public boolean isMatch(Choice userChoice) {
        if (this == userChoice) {
            System.out.println("Match!");
            return true;
        } else
            System.out.println("Don't Match!");
        return false;
    }

    @Override
    public String toString() {
        return "choiceNo=" + choiceNo +
                ", choiceItem='" + choiceItem + '\'';
    }
}

