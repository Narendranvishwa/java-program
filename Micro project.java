import java.util.Scanner;
abstract class Question {
 protected String question;
 protected int answer;
 Question(String question, int answer) {
 this.question = question;
 this.answer = answer;
 }
 abstract boolean checkAnswer(int userAnswer);
 void displayQuestion() {
 System.out.println(question);
 }
 int getCorrectAnswer() {
 return answer;
 }
}
class AdditionQuestion extends Question {
 AdditionQuestion(String question, int answer) {
 super(question, answer);
 }
 @Override
 boolean checkAnswer(int userAnswer) {
 return userAnswer == answer;
 }
}
class SubtractionQuestion extends Question {
 SubtractionQuestion(String question, int answer) {
 super(question, answer);
 }
 @Override
 boolean checkAnswer(int userAnswer) {
 return userAnswer == answer;
 }
}
class MultiplicationQuestion extends Question {
 MultiplicationQuestion(String question, int answer) {
 super(question, answer);
}
 @Override
 boolean checkAnswer(int userAnswer) {
 return userAnswer == answer;
 }
}
class DivisionQuestion extends Question {
 DivisionQuestion(String question, int answer) {
 super(question, answer);
 }
 @Override
 boolean checkAnswer(int userAnswer) {
 return userAnswer == answer;
 }
}
public class MathQuiz {
 static void showWelcome() {
 System.out.println("==================================");
 System.out.println(" WELCOME TO MATH QUIZ ");
 System.out.println("==================================");
 System.out.println("Answer all 10 questions.");
 System.out.println("Each correct answer gives 1 mark.");
 System.out.println();
 }
 static void showResult(int total, int score) {
 System.out.println();
 System.out.println("==================================");
 System.out.println(" QUIZ RESULT ");
 System.out.println("==================================");
 System.out.println("Total Questions : " + total);
 System.out.println("Correct Answers : " + score);
 System.out.println("Wrong Answers : " + (total - score));
 System.out.println("Final Score : " + score + "/" + total);
 if (score >= 9) {
 System.out.println("Performance : Excellent!");
 } else if (score >= 7) {
 System.out.println("Performance : Very Good!");
 } else if (score >= 5) {
System.out.println("Performance : Good!");
 } else {
 System.out.println("Performance : Need More Practice.");
 }
 System.out.println("==================================");
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Question[] questions = {
 new AdditionQuestion("1. What is 5 + 3?", 8),
 new SubtractionQuestion("2. What is 12 - 7?", 5),
 new MultiplicationQuestion("3. What is 6 * 4?", 24),
 new DivisionQuestion("4. What is 20 / 5?", 4),
 new AdditionQuestion("5. What is 9 + 6?", 15),
 new SubtractionQuestion("6. What is 15 - 8?", 7),
 new MultiplicationQuestion("7. What is 7 * 3?", 21),
 new DivisionQuestion("8. What is 36 / 6?", 6),
 new AdditionQuestion("9. What is 10 + 11?", 21),
 new SubtractionQuestion("10. What is 25 - 9?", 16)
 };
 int score = 0;
 showWelcome();
 for (Question q : questions) {
 q.displayQuestion();
 System.out.print("Enter your answer: ");
 int userAnswer = sc.nextInt();
 if (q.checkAnswer(userAnswer)) {
 System.out.println("Result: Correct Answer");
 score++;
 } else {
 System.out.println("Result: Wrong Answer");
 System.out.println("Correct Answer: " + q.getCorrectAnswer());
 }
 System.out.println("----------------------------------");
 }
 showResult(questions.length, score);
 sc.close();
 }
}
