public class Stack {
    private int Maxsize;
    private int [] StackArray;
    private int top; // represent the index position of the last item on the stack

    public Stack (int size ) {
        this.Maxsize = size ;
        this.top = -1 ;
        this.StackArray = new int [Maxsize];

    }
    public void push (int num){

    top ++ ;
    StackArray[top] = num;

    }
    public /*long*/void  pop (){
       // int Old_top = top;

        top--;

        //return StackArray[Old_top];// Old_top;

    }
    public int top(){

        return StackArray [top];

    }
    public  boolean IsEmpty() {


        return (top ==-1);

    }

public boolean IsFull(){

        return (Maxsize -1 == top );
}

public  String postFixEval(String postFix){

        Stack  MyStak1 = new Stack(postFix.length()/2+1);

        for (int i = 0; i<postFix.length();i ++){
            char ch = postFix.charAt(i);
            if ((ch == '*')|| (ch =='+')|| (ch == '-')|| (ch =='^')||(ch == '/')){

                if (isOperation (c)){
                int b = MyStak1.top; MyStak1.pop();
                int a = MyStak1.top; MyStak1.pop();

                if (ch == '*') MyStak1.push(a*b);
                else if (ch == '+') MyStak1.push(a+b);
                  else if (ch == '-') MyStak1.push(a-b);
                   else if (ch == '^') MyStak1.push(a^b);


            }
                else {


                    MyStak1.push(ch - '0');
                }
        }




        return MyStak1.top();  // return stack.top();
}

   public  Static String  infixToPostfix(String infix){

        Stack MyStack2 = new Stack(infix.length()/2);
        String postfix = "";

        for (int i = 0 ; i< infix.length();i++){
            char c = infix.charAt(i);

            if     ((c != '*')||
                    (c != '+')||
                    (c != '-')||
                    (c != '/')||
                    (c !='^' )||
                    (c !='(' )||
                    (c !=')'))







                MyStack2.push(c);

            else if (c =='('){
                MyStack2.push(c);
                if (c==')') {

                    while (!MyStack2.IsEmpty()){
                        char t = MyStack2.pop();
                        if (t != '('){
                            postfix = postfix + t;
                        }else {
                            break;
                        }
                    }

                }

            }else if (c == '+' || c == '-' || c =='*'|| c == '/' ){

                if (MyStack2.IsEmpty()){
                    MyStack2.push(c);
                }else {
                    while (!MyStack2.IsEmpty()){
                        char t = MyStack2.pop();
                        if (t == '('){
                            MyStack2.push(c);
                            break;

                        }else  if (t == '+'|| t =='-'|| t == '*'||t =='/'){
                            if (getPriority(t) < getpriority(c)){
                                MyStack2.push(c);
                            }
                        }
                    }
                }

            }

        }







    }
		return



}







}
