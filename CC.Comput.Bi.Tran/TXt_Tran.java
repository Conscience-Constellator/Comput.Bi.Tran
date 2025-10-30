package CC.Encycloped.Abs.Org.Comput.Bi;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Sorc.Writing;
import java.util.HashMap;
import static CC.Encycloped.Abs.Org.Comput.Bi.Bi.*;
import static CC.Encycloped.Abs.Org.Comput.Bi.HXdec.HXdec_Up;
import static CC.Encycloped.Abs.Org.Comput.Bi.Tran.BrAlg;
import static CC.Encycloped.Abs.Org.Comput.Bi.Tran.OI;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_Nd;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt;
import static java.lang.String.valueOf;

public class TXt_Tran extends Translator
{
	static{Init_StRt(TXt_Tran.class);}

	public static final Clas_Rap Class=null;

	public TXt_Tran(String[] List,String Name)
	{
		Set_List(List);
		Set_Nam(Name);
	}
	public TXt_Tran(){}

	public String[] List=new String[256];
	public void Set_List(String[] List)
	{
		List_Int_To_Byt(List,this.List);
		for(int Index=0;Index<256;Index+=1){String_To_Byte.put(List[Index],Int_To_Byt(Index));}
	}
	public String[] Get_List(){return List;}
	public HashMap<String,Byte> String_To_Byte=new HashMap<>();

	public void Tran(byte Bin,StringBuilder Builder){Builder.append(Tran(Bin));}
		public static void Tran(byte Bin,StringBuilder Builder,String Name){Get(Name).Tran(Bin,Builder);}
		@Override public String Tran(byte Bin){return Get_List()[(int)Bin>>>24];}
			public static String Tran(byte Bin,String Name){return Get(Name).Tran(Bin);}
	public void Tran(short Bin,StringBuilder Builder)
	{
		Tran((byte)(Bin&0xFF),Builder);
		Tran((byte)(Bin&0x00FF<<8),Builder);
	}
		public static void Tran(short Bin,StringBuilder Builder,String Name){Get(Name).Tran(Bin,Builder);}
		public String Tran(short Bin)
		{
			StringBuilder Builder=new StringBuilder();
			Tran(Bin,Builder);

			return Builder.toString();
		}
			public static String Tran(short Bin,String Name){return Get(Name).Tran(Bin);}
	public void Tran(int Bin,StringBuilder Builder)
	{
		Tran((short)(Bin&0xFFFF),Builder);
		Tran((short)(Bin&0x0000FFFF<<16),Builder);
	}
		public static void Tran(int Bin,StringBuilder Builder,String Name){Get(Name).Tran(Bin,Builder);}
		public String Tran(int Bin)
		{
			StringBuilder Builder=new StringBuilder();
			Tran(Bin,Builder);

			return Builder.toString();
		}
			public static String Tran(int Bin,String Name){return Get(Name).Tran(Bin);}
	public void Tran(long Bin,StringBuilder Builder)
	{
		Tran((int)(Bin),Builder);
		Tran((int)(Bin<<32),Builder);
	}
		public static void Tran(long Bin,StringBuilder Builder,String Name){Get(Name).Tran(Bin,Builder);}
		public String Tran(long Bin)
		{
			StringBuilder Builder=new StringBuilder();
			Tran(Bin,Builder);

			return Builder.toString();
		}
			public static String Tran(long Bin,String Name){return Get(Name).Tran(Bin);}
	public byte Tran_1(String String){return String_To_Byte.get(String);}
		public static byte Tran_1(String String,String Name){return Get(Name).Tran_1(String);}
	public byte Tran_2(String String){return String_To_Byte.get(String);}
		public static byte Tran_2(String String,String Name){return Get(Name).Tran_2(String);}
	public byte Tran_4(String String){return String_To_Byte.get(String);}
		public static byte Tran_4(String String,String Name){return Get(Name).Tran_4(String);}
	public byte Tran_8(String String){return String_To_Byte.get(String);}
		public static byte Tran_8(String String,String Name){return Get(Name).Tran_8(String);}
	public String Up(String A,byte Shift){return Tran(Tran_1(A)>>>Shift);}
		public static String Up(String A,byte Shift,String Tran){return Get(Tran).Up(A,Shift);}
	public String Down(String A,byte Shift){return Tran(Tran_1(A)>>Shift);}
		public static String Down(String A,byte Shift,String Tran){return Get(Tran).Down(A,Shift); }
	public String Rev(String A){return Tran(Rev.Rev(Tran_1(A)));}
		public static String Rev(String A,String Tran){return Get(Tran).Rev(A);}
	public String Not(String A){return Tran(~Tran_1(A));}
		public static String Not(String A,String Tran){return Get(Tran).Not(A);}
	public String Or(String A,String B){return Tran(Tran_1(A)|Tran_1(B));}
		public static String Or(String A,String B,String Tran){return Get(Tran).Or(A,B);}
	public String XOr(String A,String B){return Tran(Tran_1(A)^Tran_1(B));}
		public static String XOr(String A,String B,String Tran){return Get(Tran).XOr(A,B);}
	public String And(String A,String B){return Tran(Tran_1(A)&Tran_1(B));}
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

	public static HashMap<String,TXt_Tran> Registry=new HashMap<>();
		public static void Register(TXt_Tran Tran,String Name){Registry.put(Name,Tran);}
			public static void Register(String[] List,String Name){Register(new TXt_Tran(List,Name),Name);}
				static
				{
					String[] List=new String[256];
					int Index=0;
					for(;Index<256;Index+=1){List[Index]=valueOf(BrAlg[Index]);}
					Register(List,"Bral_N");
					for(Index=0;Index<256;Index+=1){List[Index]=OI(Int_To_Byt(Index),"0","1");}
					Register(List,"Bral_S");
					Register(List,"Bral_Z");
					Register(List,"01");
					char A='0',B;
					int A_=0,B_=0;
					for(Index=0;A_<16;Index+=1,A=HXdec_Up(A),A_+=1){for(B='0',B_=0;B_<16;B=HXdec_Up(B),B_+=1){List[Index]=A+""+B;}}
					Register(List,"Hexdec");
				}
		public static TXt_Tran Get(String Name){return Registry.get(Name);}

	static{Init_Nd(TXt_Tran.class);}
}