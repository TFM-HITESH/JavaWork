//MAIN DRIVER CODE

import VITUniversity.Students;
import VITUniversity.Faculty;

import VITUniversity.SCOPE.*;

public class importingPackages 
{
    public static void main(String args[])
    {
        Students s = new Students();
        s.set();
        s.display();

        Faculty f = new Faculty();
        f.set();
        f.display();

        Lab scopeLab = new Lab();
        scopeLab.display_rules();

        VITUniversity.SENSE.Lab senseLab = new VITUniversity.SENSE.Lab();
        senseLab.display_rules();
    }    
}
