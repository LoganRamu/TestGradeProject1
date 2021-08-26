package Learning.JavaLearnings.StringLearning;

/*Bufferreader is mutable
declare using new only
* Not possible for multi thread*/

public class StringVsStringBuffer {
    public static void main(String[] args) {
        String name="Logan";
        System.out.println("String immutable--"+name.concat("alien"));
        System.out.println("original name--"+name);
        StringBuffer sb=new StringBuffer("Logan");
        System.out.println("StringBuffer mutable--"+sb.append("alien"));
        System.out.println("original name--"+sb);

    }
}

/*Methods:
StringBuffer sb=new StringBuffer("Logan");
sb.reverse()     : dont have it in string
replace()
delete()
insert()
capacity(): default capacity 20

* */