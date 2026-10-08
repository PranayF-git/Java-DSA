@FunctionalInterface
/**
 * InnerLambdaExpression
 */
interface InnerLambdaExpression {
    void display(int i);
}

public class LambdaExpression {
    public static void main(String[] args) {
        InnerLambdaExpression obj = (i) -> System.out.println("Learning lambda expression.." + i);
        obj.display(5);
    }
}
