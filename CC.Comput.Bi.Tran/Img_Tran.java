package CC.Encycloped.Abs.Org.Comput.Bi;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Sorc.Writing;
import CC.UI.Lit.D2_Int.Colr_Getbl_2_Int;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Stat_Ovr;
import java.util.HashMap;
import static CC.Encycloped.Abs.Org.Comput.Bi.Bi.*;
import static java.lang.String.valueOf;

public class Img_Tran extends Translator
{
//	public static final Clas_Rap Class=Init_StRt(Img_Tran.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	public Img_Tran(Colr_Getbl_2_Int[] List,String Name)
	{
		Set_List(List);
		Set_Nam(Name);
	}
	public Img_Tran(){}

	public String[] List=new String[256];
	public void Set_List(String[] List)
	{
		List_Int_To_Byt(List,this.List);
		for(int Index=0;Index<256;Index+=1){String_To_Byte.put(List[Index],Int_To_Byt(Index));}
	}
	public String[] Get_List(){return List;}
	public HashMap<String,Byte> String_To_Byte=new HashMap<>();

	@Override public String Tran(byte Bin){return Get_List()[(int)Bin>>>24];}
		@Stat_Ovr
		public static String Tran(byte Bin,String Name){return Get(Name).Tran(Bin);}
//	public String Tran(short Bin)
//	{
//		StringBuilder Builder=new StringBuilder();
//		Tran(Bin,Builder);
//
//		return Builder.toString();
//	}
//		public static String Tran(short Bin,String Name){return Get(Name).Tran(Bin);}
//	public String Tran(int Bin)
//	{
//		StringBuilder Builder=new StringBuilder();
//		Tran(Bin,Builder);
//
//		return Builder.toString();
//	}
//		public static String Tran(int Bin,String Name){return Get(Name).Tran(Bin);}
//	public String Tran(long Bin)
//	{
//		StringBuilder Builder=new StringBuilder();
//		Tran(Bin,Builder);
//
//		return Builder.toString();
//	}
//		public static String Tran(long Bin,String Name){return Get(Name).Tran(Bin);}
	public byte Tran_1(String String){return String_To_Byte.get(String);}
		public static byte Tran_1(String String,String Name){return Get(Name).Tran_1(String);}
//	public byte Tran_2(String String){return String_To_Byte.get(String);}
//		public static byte Tran_2(String String,String Name){return Get(Name).Tran_2(String);}
//	public byte Tran_4(String String){return String_To_Byte.get(String);}
//		public static byte Tran_4(String String,String Name){return Get(Name).Tran_4(String);}
//	public byte Tran_8(String String){return String_To_Byte.get(String);}
//		public static byte Tran_8(String String,String Name){return Get(Name).Tran_8(String);}
	public String Up(String A,byte Shift){return Tran((byte)(Tran_1(A)>>>Shift));}
		public static String Up(String A,byte Shift,String Tran){return Get(Tran).Up(A,Shift);}
	public String Down(String A,byte Shift){return Tran((byte)(Tran_1(A)>>Shift));}
		public static String Down(String A,byte Shift,String Tran){return Get(Tran).Down(A,Shift); }
	public String Rev(String A){return Tran(Rev.Rev(Tran_1(A)));}
		public static String Rev(String A,String Tran){return Get(Tran).Rev(A);}
	public String Not(String A){return Tran((byte)~Tran_1(A));}
		public static String Not(String A,String Tran){return Get(Tran).Not(A);}
	public String Or(String A,String B){return Tran((byte)(Tran_1(A)|Tran_1(B)));}
		public static String Or(String A,String B,String Tran){return Get(Tran).Or(A,B);}
	public String XOr(String A,String B){return Tran((byte)(Tran_1(A)^Tran_1(B)));}
		public static String XOr(String A,String B,String Tran){return Get(Tran).XOr(A,B);}
	public String And(String A,String B){return Tran((byte)(Tran_1(A)&Tran_1(B)));}
		public static String And(String A,String B,String Tran){return Get(Tran).And(A,B);}

	public static void Get_Source(StringBuilder Builder)
	{
		for(int Index=0,Line=0,P;Line<16;Line+=1)
		{
			for(P=0;P<16;P+=1)
			{
				Writing.Case(valueOf(Index),"return ");
				Index+=1;
			}
		}
	}
	public static String Get_Source()
	{
		StringBuilder Builder=new StringBuilder();
		Get_Source(Builder);

		return Builder.toString();
	}

	public static HashMap<String,Img_Tran> Registry=new HashMap<>();
		public static void Register(Img_Tran Tran,String Name){Registry.put(Name,Tran);}
		public static void Register(Colr_Getbl_2_Int[] List,String Name){Register(new Img_Tran(List,Name),Name);}
		public static Img_Tran Get(String Name){return Registry.get(Name);}

	static{Init_Nd(Img_Tran.class);}
}