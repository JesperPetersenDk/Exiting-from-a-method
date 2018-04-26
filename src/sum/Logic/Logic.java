
package sum.Logic;

public class Logic {
    
    public void showSum(float x, float y, int count)
    {
        if(count < 1)
        {
           return;//den vil ikke arbejde videre hvis "count" har mindre end 1.
        }
        
        float total = x * y;
        for (int i = 0; i < count; i++) {
            System.out.println(total);
        }
        
    }
}
