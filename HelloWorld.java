package structuralType.adapter2;

public class AC220 implements AC {
    public final int output = 220;

    @Override
    public int outputAC() {
	int i=1;
        return output;
    }
}