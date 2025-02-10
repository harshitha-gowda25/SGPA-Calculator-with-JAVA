import java.util.*;
public class sgpa
{
    public static void main(String args[])
    {
        double d=0.0,num=0.0,sgpa;
        Scanner ob=new Scanner(System.in);
        int subno;
        String name,usn;
        System.out.println("Enter Name");
        name=ob.nextLine();
        System.out.println("Enter USN");
        usn=ob.nextLine();
        System.out.println("Enter no. of subjects");
        subno=ob.nextInt();
        String sub[]=new String[subno];
        int cc[]=new int[subno];
        int marks[]=new int[subno];
        int grade[]=new int[subno];
        String react="";
        System.out.println("Enter the subject name");
        System.out.println("DISCLAIMER: SPACES SHOULDN'T BE INCLUDED WHILE ENTERING(ALTERNATIVE FOR SPACE USE _)");
        for(int i=0;i<subno;i++)
        {
            System.out.println("Enter Subject: "+(i+1));
            sub[i]=ob.next();
        }
        System.out.println("Enter the credits for the following subjects");
        for(int i=0;i<subno;i++)
        {
            System.out.print(sub[i]+": ");
            cc[i]=ob.nextInt();
            d+=cc[i];
        }
        System.out.println("Enter the marks for the following subjects");
        for(int i=0;i<subno;i++)
        {
            System.out.print(sub[i]+": ");
            marks[i]=ob.nextInt();
        }
        
        for(int i=0;i<subno;i++)
        {
            if(marks[i]>=90)
            grade[i]=10;
            else if((marks[i]>=80)&&(marks[i]<90))
            grade[i]=9;
            else if((marks[i]>=70)&&(marks[i]<80))
            grade[i]=8;
            else if((marks[i]>=60)&&(marks[i]<70))
            grade[i]=8;
            else if((marks[i]>=45)&&(marks[i]<60))
            grade[i]=8;
            else if((marks[i]>=40)&&(marks[i]<45))
            grade[i]=8;
            else
            grade[i]=0;
        }
        
        for(int i=0;i<subno;i++)
        {
            num+=(cc[i]*grade[i]);
        }
        sgpa=num/d;
        for(int i=0;i<subno;i++)
        {
            if(sgpa>=9)
            react=":)))";
            else if(sgpa>=8&sgpa<9)
            react=":))";
            else if(sgpa>=7&&sgpa<8)
            react=":)";
            else if(sgpa>=5&&sgpa<7)
            react=":o";
            else
            react=":(";
        }
        System.out.println("==============================================");
        System.out.println("=============Your Report Card=================");
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("==============================================");
        System.out.println("Subject \t Grade \t Marks \t Credits");
        for(int i=0;i<subno;i++)
        {
            System.out.println(sub[i]+" \t "+grade[i]+" \t "+marks[i]+" \t "+cc[i]);
        }
        System.out.println("=============================================");
        System.out.println("SGPA = "+sgpa);
        System.out.println("Reaction  "+react);
    }
}
