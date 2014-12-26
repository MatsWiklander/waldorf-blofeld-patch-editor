package main.java.se.matswiklander.waldorfblofeldpatcheditor.models.patch;

import java.util.Comparator;

public class CategoryNameComparator implements Comparator<Patch> {

        @Override
        public int compare(Patch arg0, Patch arg1) {
                int i = arg0.getCategory().compareTo(arg1.getCategory());
                if (i != 0)
                        return i;

                i = arg0.getName().compareTo(arg1.getName());
                if (i != 0)
                        return i;

                return 0;
        }
}
