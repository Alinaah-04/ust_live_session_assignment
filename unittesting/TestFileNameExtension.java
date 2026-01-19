package unittesting;

public class TestFileNameExtension {
public boolean testFileNameExtension(String filename)
{
	if(filename.contains(".csv"))
	{
		return true;
	}
	else
	{
		return false;
	}
}

}
