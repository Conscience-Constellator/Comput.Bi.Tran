package CC.Encycloped.Abs.Org.Comput.Bi;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

import CC.Encycloped.Abs.Org.Syc.TXt.Text;
import CC.UI.GUI.Basd_On_Java.Com_Havr;
import CC.List.Bilat_Hash_Map;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import static CC.Encycloped.Abs.Org.Comput.Bi.Bi.Int_To_Byt;
import static CC.Encycloped.Abs.Org.Comput.Bi.Bit.*;
import static CC.Encycloped.Abs.Org.Comput.Bi.Wrd_GAt.Or;
import static CC.Encycloped.Abs.Org.Comput.Soft.Memory.Point_To_Long;
import static CC.UI.GUI.Act_Run.Ad_But;
import static java.lang.System.nanoTime;
import static java.lang.System.out;
import static javax.swing.JSplitPane.HORIZONTAL_SPLIT;
import static java.lang.Byte.parseByte;
import static java.lang.Double.doubleToRawLongBits;
import static java.lang.Float.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tran
{
	public static void OI(boolean Bi,String O,String I,StringBuilder Bildr)
	{
		Bildr.append((Bi)?I:O);
	}
	public static void OI(byte Bi,String O,String I,StringBuilder Bildr)
	{
		OI(Or(Bi,A1),O,I,Bildr);
		OI(Or(Bi,A2),O,I,Bildr);
		OI(Or(Bi,A3),O,I,Bildr);
		OI(Or(Bi,A4),O,I,Bildr);
		OI(Or(Bi,A5),O,I,Bildr);
		OI(Or(Bi,A6),O,I,Bildr);
		OI(Or(Bi,A7),O,I,Bildr);
		OI(Or(Bi,A8),O,I,Bildr);
	}
		public static void OI(byte Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
//		@Finishd(Is_Finishd=true)
		public static String OI(byte Bi,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(byte Bi)
			{return OI(Bi,O,I);}
				public static void Print_Bi(byte Bi)
				{out.println(OI(Bi));}
	public static void OI(char Bi,String O,String I,StringBuilder Bildr)
	{
		OI(Or(Bi,B1),O,I,Bildr);
		OI(Or(Bi,B2),O,I,Bildr);
		OI(Or(Bi,B3),O,I,Bildr);
		OI(Or(Bi,B4),O,I,Bildr);
		OI(Or(Bi,B5),O,I,Bildr);
		OI(Or(Bi,B6),O,I,Bildr);
		OI(Or(Bi,B7),O,I,Bildr);
		OI(Or(Bi,B8),O,I,Bildr);
		OI(Or(Bi,B9),O,I,Bildr);
		OI(Or(Bi,B10),O,I,Bildr);
		OI(Or(Bi,B11),O,I,Bildr);
		OI(Or(Bi,B12),O,I,Bildr);
		OI(Or(Bi,B13),O,I,Bildr);
		OI(Or(Bi,B14),O,I,Bildr);
		OI(Or(Bi,B15),O,I,Bildr);
		OI(Or(Bi,B16),O,I,Bildr);
	}
		public static void OI(char Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
		public static String OI(char Bi,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(char Bi)
			{return OI(Bi,O,I);}
	public static void OI(short Bi,String O,String I,StringBuilder Bildr)
	{
		OI(Or(Bi,B1),O,I,Bildr);
		OI(Or(Bi,B2),O,I,Bildr);
		OI(Or(Bi,B3),O,I,Bildr);
		OI(Or(Bi,B4),O,I,Bildr);
		OI(Or(Bi,B5),O,I,Bildr);
		OI(Or(Bi,B6),O,I,Bildr);
		OI(Or(Bi,B7),O,I,Bildr);
		OI(Or(Bi,B8),O,I,Bildr);
		OI(Or(Bi,B9),O,I,Bildr);
		OI(Or(Bi,B10),O,I,Bildr);
		OI(Or(Bi,B11),O,I,Bildr);
		OI(Or(Bi,B12),O,I,Bildr);
		OI(Or(Bi,B13),O,I,Bildr);
		OI(Or(Bi,B14),O,I,Bildr);
		OI(Or(Bi,B15),O,I,Bildr);
		OI(Or(Bi,B16),O,I,Bildr);
	}
		public static void OI(short Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
		public static String OI(short Bin,String _0,String _1)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bin,_0,_1,Bildr);

			return Bildr.toString();
		}
			public static String OI(short Bi)
			{return OI(Bi,O,I);}
	public static void OI(float Bin,String O,String I,StringBuilder Bildr){OI(floatToRawIntBits(Bin),O,I,Bildr);}
		public static void OI(float Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
		public static String OI(float Bi,String _0,String _1)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,_0,_1,Bildr);

			return Bildr.toString();
		}
			public static String OI(float Bin)
			{return OI(Bin,O,I);}
	public static void OI(int Bi,String O,String I,StringBuilder Bildr)
	{
		Bildr.append(((Bi&C1)!=0)?I:O);
		Bildr.append(((Bi&C2)!=0)?I:O);
		Bildr.append(((Bi&C3)!=0)?I:O);
		Bildr.append(((Bi&C4)!=0)?I:O);
		Bildr.append(((Bi&C5)!=0)?I:O);
		Bildr.append(((Bi&C6)!=0)?I:O);
		Bildr.append(((Bi&C7)!=0)?I:O);
		Bildr.append(((Bi&C8)!=0)?I:O);
		Bildr.append(((Bi&C9)!=0)?I:O);
		Bildr.append(((Bi&C10)!=0)?I:O);
		Bildr.append(((Bi&C11)!=0)?I:O);
		Bildr.append(((Bi&C12)!=0)?I:O);
		Bildr.append(((Bi&C13)!=0)?I:O);
		Bildr.append(((Bi&C14)!=0)?I:O);
		Bildr.append(((Bi&C15)!=0)?I:O);
		Bildr.append(((Bi&C16)!=0)?I:O);
		Bildr.append(((Bi&C17)!=0)?I:O);
		Bildr.append(((Bi&C18)!=0)?I:O);
		Bildr.append(((Bi&C19)!=0)?I:O);
		Bildr.append(((Bi&C20)!=0)?I:O);
		Bildr.append(((Bi&C21)!=0)?I:O);
		Bildr.append(((Bi&C22)!=0)?I:O);
		Bildr.append(((Bi&C23)!=0)?I:O);
		Bildr.append(((Bi&C24)!=0)?I:O);
		Bildr.append(((Bi&C25)!=0)?I:O);
		Bildr.append(((Bi&C26)!=0)?I:O);
		Bildr.append(((Bi&C27)!=0)?I:O);
		Bildr.append(((Bi&C28)!=0)?I:O);
		Bildr.append(((Bi&C29)!=0)?I:O);
		Bildr.append(((Bi&C30)!=0)?I:O);
		Bildr.append(((Bi&C31)!=0)?I:O);
		Bildr.append(((Bi&C32)!=0)?I:O);
	}
		public static void OI(int Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
		public static String OI(int Bi,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(int Bi)
			{return OI(Bi,O,I);}
	public static void OI(double Bin,String O,String I,StringBuilder Bildr)
	{OI(doubleToRawLongBits(Bin),O,I,Bildr);}
		public static void OI(double Bi,StringBuilder Bildr){OI(Bi,O,I,Bildr);}
		public static String OI(double Bi,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(double Bi)
			{return OI(Bi,O,I);}
	public static void OI(long Bi,String O,String I,StringBuilder Bildr)
	{
		OI(Or(Bi,D1),O,I,Bildr);
		OI(Or(Bi,D2),O,I,Bildr);
		OI(Or(Bi,D3),O,I,Bildr);
		OI(Or(Bi,D4),O,I,Bildr);
		OI(Or(Bi,D5),O,I,Bildr);
		OI(Or(Bi,D6),O,I,Bildr);
		OI(Or(Bi,D7),O,I,Bildr);
		OI(Or(Bi,D8),O,I,Bildr);
		OI(Or(Bi,D9),O,I,Bildr);
		OI(Or(Bi,D10),O,I,Bildr);
		OI(Or(Bi,D11),O,I,Bildr);
		OI(Or(Bi,D12),O,I,Bildr);
		OI(Or(Bi,D13),O,I,Bildr);
		OI(Or(Bi,D14),O,I,Bildr);
		OI(Or(Bi,D15),O,I,Bildr);
		OI(Or(Bi,D16),O,I,Bildr);
		OI(Or(Bi,D17),O,I,Bildr);
		OI(Or(Bi,D18),O,I,Bildr);
		OI(Or(Bi,D19),O,I,Bildr);
		OI(Or(Bi,D20),O,I,Bildr);
		OI(Or(Bi,D21),O,I,Bildr);
		OI(Or(Bi,D22),O,I,Bildr);
		OI(Or(Bi,D23),O,I,Bildr);
		OI(Or(Bi,D24),O,I,Bildr);
		OI(Or(Bi,D25),O,I,Bildr);
		OI(Or(Bi,D26),O,I,Bildr);
		OI(Or(Bi,D27),O,I,Bildr);
		OI(Or(Bi,D28),O,I,Bildr);
		OI(Or(Bi,D29),O,I,Bildr);
		OI(Or(Bi,D30),O,I,Bildr);
		OI(Or(Bi,D31),O,I,Bildr);
		OI(Or(Bi,D32),O,I,Bildr);
		OI(Or(Bi,D33),O,I,Bildr);
		OI(Or(Bi,D34),O,I,Bildr);
		OI(Or(Bi,D35),O,I,Bildr);
		OI(Or(Bi,D36),O,I,Bildr);
		OI(Or(Bi,D37),O,I,Bildr);
		OI(Or(Bi,D38),O,I,Bildr);
		OI(Or(Bi,D39),O,I,Bildr);
		OI(Or(Bi,D40),O,I,Bildr);
		OI(Or(Bi,D41),O,I,Bildr);
		OI(Or(Bi,D42),O,I,Bildr);
		OI(Or(Bi,D43),O,I,Bildr);
		OI(Or(Bi,D44),O,I,Bildr);
		OI(Or(Bi,D45),O,I,Bildr);
		OI(Or(Bi,D46),O,I,Bildr);
		OI(Or(Bi,D47),O,I,Bildr);
		OI(Or(Bi,D48),O,I,Bildr);
		OI(Or(Bi,D49),O,I,Bildr);
		OI(Or(Bi,D50),O,I,Bildr);
		OI(Or(Bi,D51),O,I,Bildr);
		OI(Or(Bi,D52),O,I,Bildr);
		OI(Or(Bi,D53),O,I,Bildr);
		OI(Or(Bi,D54),O,I,Bildr);
		OI(Or(Bi,D55),O,I,Bildr);
		OI(Or(Bi,D56),O,I,Bildr);
		OI(Or(Bi,D57),O,I,Bildr);
		OI(Or(Bi,D58),O,I,Bildr);
		OI(Or(Bi,D59),O,I,Bildr);
		OI(Or(Bi,D60),O,I,Bildr);
		OI(Or(Bi,D61),O,I,Bildr);
		OI(Or(Bi,D62),O,I,Bildr);
		OI(Or(Bi,D63),O,I,Bildr);
		OI(Or(Bi,D64),O,I,Bildr);
	}
		public static void OI(long Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
		public static String OI(long Bi,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(long Bi)
			{return OI(Bi,O,I);}
	public static void OI(Object Bi,String O,String I,StringBuilder Bildr)
	{OI(Point_To_Long(Bi),O,I,Bildr);}
		public static void OI(Object Bi,StringBuilder Bildr)
		{OI(Bi,O,I,Bildr);}
		public static String OI(Object Bi,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(Bi,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(Object Bi)
			{return OI(Bi,O,I);}
	public static void OI(byte[] List,String O,String I,StringBuilder Bildr)
	{
		for(byte Bi:List)
		{OI(Bi,O,I,Bildr);}
	}
		public static void OI(byte[] List,StringBuilder Bildr)
		{OI(List,O,I,Bildr);}
		public static String OI(byte[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(byte[] List)
			{return OI(List,O,I);}
	public static void OI(char[] List,String O,String I,StringBuilder Bildr)
	{for(char Bi:List){OI(Bi,O,I,Bildr);}}
		public static void OI(char[] List,StringBuilder Bildr)
		{OI(List,O,I,Bildr);}
		public static String OI(char[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(char[] List)
			{return OI(List,O,I);}
	public static void OI(short[] List,String O,String I,StringBuilder Bildr)
	{
		for(short Bi:List)
		{OI(Bi,O,I,Bildr);}
	}
		public static void OI(short[] List,StringBuilder Bildr)
		{OI(List,O,I,Bildr);}
		public static String OI(short[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(short[] List)
			{return OI(List,O,I);}
	public static void OI(float[] List,String O,String I,StringBuilder Bildr)
	{
		for(float Bi:List)
		{OI(Bi,O,I,Bildr);}
	}
		public static void OI(float[] List,StringBuilder Bildr)
		{OI(List,O,I,Bildr);}
		public static String OI(float[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(float[] List){return OI(List,O,I);}
	public static void OI(long[] List,String O,String I,StringBuilder Bildr)
	{for(long Bi:List){OI(Bi,O,I,Bildr);}}
		public static void OI(long[] List,StringBuilder Bildr){OI(List,O,I,Bildr);}
		public static String OI(long[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(long[] List){return OI(List,O,I);}
	public static void OI(int[] List,String O,String I,StringBuilder Bildr){for(int Bi:List){OI(Bi,O,I,Bildr);}}
		public static void OI(int[] List,StringBuilder Bildr){OI(List,O,I,Bildr);}
		public static String OI(int[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(int[] List){return OI(List,O,I);}
	public static void OI(double[] List,String O,String I,StringBuilder Bildr)
	{for(double Bi:List){OI(Bi,O,I,Bildr);}}
		public static void OI(double[] List,StringBuilder Bildr)
		{OI(List,O,I,Bildr);}
		public static String OI(double[] List,String O,String I)
		{
			StringBuilder Bildr=new StringBuilder();
			OI(List,O,I,Bildr);

			return Bildr.toString();
		}
			public static String OI(double[] List)
			{return OI(List,O,I);}
	//public static void _01(int Bi,String O,String I,StringBuilder Bildr){for(byte Bit=0;Bit<32;Bit+=1)
	//{Bildr.append(((Bi>>>Bit&1)!=1)?O:I);}}
	//public static void _01(long Bi,String O,String I,StringBildr Bildr)
	//{
	//	for(byte Bit=0;
	//		Bit<64;
	//		Bit+=1)
	//	{Bildr.append(((Bi>>>Bit&1)!=1)?O:I);}
	//}
	public static String[] OI_List(String O,String I)
	{
		String[] List=new String[256];
		for(int IndX=0;
			IndX<256;
			IndX+=1)
		{List[IndX]=OI(Int_To_Byt(IndX),O,I);}

		return List;
	}
	public static Bilat_Hash_Map<String,Byte> Byt_Hexdec;
		public static HashMap<String,Byte> Hexdec_To_Byt;
		public static HashMap<Byte,String> Byt_To_Hexdec;
	/*public static byte Rvrs_Bits(byte Number)
	{
		out.println(Bi_To_String(Number).makeConcatWithConstants<invokedynamic>(Bi_To_String(Number)));
		byte Reverse=false;
		int p=0;
		int p=p|Number&255;
		out.println(Bi_To_String(p).makeConcatWithConstants<invokedynamic>(Bi_To_String(p)));
		p=Integer.reverse(p);
		out.println(Bi_To_String(p).makeConcatWithConstants<invokedynamic>(Bi_To_String(p)));
		out.println(Bi_To_String((byte)(p&255)).makeConcatWithConstants<invokedynamic>(Bi_To_String((byte)(p&255))));
		return (byte)((p&255)>>24);
	}*/
	public static void Byt_To_BrAl(byte[] List,StringBuilder Bildr)
	{
		for(byte Byt:List)
		{Bildr.append(Byt_To_BrAl(Byt));}
	}
		public static String Byt_To_BrAl_String(byte[] List)
		{
			StringBuilder Bildr=new StringBuilder();
			Byt_To_BrAl(List,Bildr);

			return Bildr.toString();
		}
	public static String Byt_To_BrAl(String Path)throws IOException
	{return Byt_To_BrAl_String(FIl_To_Byt_ArA(Path));}
	public static void Byt_To_Hexdec(byte[] List,StringBuilder Bildr)
	{for(byte Byte:List){Bildr.append(Byt_To_Hexdec.get(Byte));};}
		public static String Byt_To_Hexdec(byte[] List)
		{
			StringBuilder Bildr=new StringBuilder();
			for(byte Byte:List)
			{Bildr.append(Byt_To_Hexdec.get(Byte));}

			return Bildr.toString();
		}

	public static int[] Byt_To_Unsin(byte[] Array)
	{
		int[] Unsin_Byt_Ara=new int[Array.length];
		for(int Byt_IndX=0;
			Byt_IndX<Array.length;
			Byt_IndX+=1)
		{Unsin_Byt_Ara[Byt_IndX]=Array[Byt_IndX]+128;}

		return Unsin_Byt_Ara;
	}
	public static byte[] String_To_Byt_ArA(String String)
	{return String.getBytes();}
	public static byte[] FIl_To_Byt_ArA(String Path)throws IOException
	{return Files.readAllBytes(Paths.get(Path));}
	public static String O="0",I="1";

public static char[] BrAlg;
	static
	{
		BrAlg=new char[]
		{
			'⠀'/*0*/,'⡀'/*1*/,'⠄'/*2*/,'⡄'/*3*/,'⠂'/*4*/,'⡂'/*5*/,'⠆'/*6*/,'⡆'/*7*/,'⠁'/*8*/,'⡁'/*9*/,'⠅'/*10*/,'⡅'/*11*/,'⠃'/*12*/,'⡃'/*13*/,'⠇'/*14*/,'⡇'/*15*/
			,'⢀'/*16*/,'⣀'/*17*/,'⢄'/*18*/,'⣄'/*19*/,'⢂'/*20*/,'⣂'/*21*/,'⢆'/*22*/,'⣆'/*23*/,'⢁'/*24*/,'⣁'/*25*/,'⢅'/*26*/,'⣅'/*27*/,'⢃'/*28*/,'⣃'/*29*/,'⢇'/*30*/,'⣇'/*31*/
			,'⠠'/*32*/,'⡠'/*33*/,'⠤'/*34*/,'⡤'/*35*/,'⠢'/*36*/,'⡢'/*37*/,'⠦'/*38*/,'⡦'/*39*/,'⠡'/*40*/,'⡡'/*41*/,'⠥'/*42*/,'⡥'/*43*/,'⠣'/*44*/,'⡣'/*45*/,'⠧'/*46*/,'⡧'/*47*/
			,'⢠'/*48*/,'⣠'/*49*/,'⢤'/*50*/,'⣤'/*51*/,'⢢'/*52*/,'⣢'/*53*/,'⢦'/*54*/,'⣦'/*55*/,'⢡'/*56*/,'⣡'/*57*/,'⢥'/*58*/,'⣥'/*59*/,'⢣'/*60*/,'⣣'/*61*/,'⢧'/*62*/,'⣧'/*63*/
			,'⠐'/*64*/,'⡐'/*65*/,'⠔'/*66*/,'⡔'/*67*/,'⠒'/*68*/,'⡒'/*69*/,'⠖'/*70*/,'⡖'/*71*/,'⠑'/*72*/,'⡑'/*73*/,'⠕'/*74*/,'⡕'/*75*/,'⠓'/*76*/,'⡓'/*77*/,'⠗'/*78*/,'⡗'/*79*/
			,'⢐'/*80*/,'⣐'/*81*/,'⢔'/*82*/,'⣔'/*83*/,'⢒'/*84*/,'⣒'/*85*/,'⢖'/*86*/,'⣖'/*87*/,'⢑'/*88*/,'⣑'/*89*/,'⢕'/*90*/,'⣕'/*91*/,'⢓'/*92*/,'⣓'/*93*/,'⢗'/*94*/,'⣗'/*95*/
			,'⠰'/*96*/,'⡰'/*97*/,'⠴'/*98*/,'⡴'/*99*/,'⠲'/*100*/,'⡲'/*101*/,'⠶'/*102*/,'⡶'/*103*/,'⠱'/*104*/,'⡱'/*105*/,'⠵'/*106*/,'⡵'/*107*/,'⠳'/*108*/,'⡳'/*109*/,'⠷'/*110*/,'⡷'/*111*/
			,'⢰'/*112*/,'⣰'/*113*/,'⢴'/*114*/,'⣴'/*115*/,'⢲'/*116*/,'⣲'/*117*/,'⢶'/*118*/,'⣶'/*119*/,'⢱'/*120*/,'⣱'/*121*/,'⢵'/*122*/,'⣵'/*123*/,'⢳'/*124*/,'⣳'/*125*/,'⢷'/*126*/,'⣷'/*127*/
			,'⠈'/*128*/,'⡈'/*129*/,'⠌'/*130*/,'⡌'/*131*/,'⠊'/*132*/,'⡊'/*133*/,'⠎'/*134*/,'⡎'/*135*/,'⠉'/*136*/,'⡉'/*137*/,'⠍'/*138*/,'⡍'/*139*/,'⠋'/*140*/,'⡋'/*141*/,'⠏'/*142*/,'⡏'/*143*/
			,'⢈'/*144*/,'⣈'/*145*/,'⢌'/*146*/,'⣌'/*147*/,'⢊'/*148*/,'⣊'/*149*/,'⢎'/*150*/,'⣎'/*151*/,'⢉'/*152*/,'⣉'/*153*/,'⢍'/*154*/,'⣍'/*155*/,'⢋'/*156*/,'⣋'/*157*/,'⢏'/*158*/,'⣏'/*159*/
			,'⠨'/*160*/,'⡨'/*161*/,'⠬'/*162*/,'⡬'/*163*/,'⠪'/*164*/,'⡪'/*165*/,'⠮'/*166*/,'⡮'/*167*/,'⠩'/*168*/,'⡩'/*169*/,'⠭'/*170*/,'⡭'/*171*/,'⠫'/*172*/,'⡫'/*173*/,'⠯'/*174*/,'⡯'/*175*/
			,'⢨'/*176*/,'⣨'/*177*/,'⢬'/*178*/,'⣬'/*179*/,'⢪'/*180*/,'⣪'/*181*/,'⢮'/*182*/,'⣮'/*183*/,'⢩'/*184*/,'⣩'/*185*/,'⢭'/*186*/,'⣭'/*187*/,'⢫'/*188*/,'⣫'/*189*/,'⢯'/*190*/,'⣯'/*191*/
			,'⠘'/*192*/,'⡘'/*193*/,'⠜'/*194*/,'⡜'/*195*/,'⠚'/*196*/,'⡚'/*197*/,'⠞'/*198*/,'⡞'/*199*/,'⠙'/*200*/,'⡙'/*201*/,'⠝'/*202*/,'⡝'/*203*/,'⠛'/*204*/,'⡛'/*205*/,'⠟'/*206*/,'⡟'/*207*/
			,'⢘'/*208*/,'⣘'/*209*/,'⢜'/*210*/,'⣜'/*211*/,'⢚'/*212*/,'⣚'/*213*/,'⢞'/*214*/,'⣞'/*215*/,'⢙'/*216*/,'⣙'/*217*/,'⢝'/*218*/,'⣝'/*219*/,'⢛'/*220*/,'⣛'/*221*/,'⢟'/*222*/,'⣟'/*223*/
			,'⠸'/*224*/,'⡸'/*225*/,'⠼'/*126*/,'⡼'/*227*/,'⠺'/*228*/,'⡺'/*229*/,'⠾'/*230*/,'⡾'/*231*/,'⠹'/*232*/,'⡹'/*233*/,'⠽'/*234*/,'⡽'/*235*/,'⠻'/*236*/,'⡻'/*237*/,'⠿'/*238*/,'⡿'/*239*/
			,'⢸'/*240*/,'⣸'/*241*/,'⢼'/*242*/,'⣼'/*243*/,'⢺'/*244*/,'⣺'/*245*/,'⢾'/*246*/,'⣾'/*247*/,'⢹'/*248*/,'⣹'/*249*/,'⢽'/*250*/,'⣽'/*251*/,'⢻'/*252*/,'⣻'/*253*/,'⢿'/*254*/,'⣿'/*255*/
		};
	}
	public static String Al_BrAl=
		"⠀⡀⠄⡄⠂⡂⠆⡆⠁⡁⠅⡅⠃⡃⠇⡇"+
		"⢀⣀⢄⣄⢂⣂⢆⣆⢁⣁⢅⣅⢃⣃⢇⣇"+
		"⠠⡠⠤⡤⠢⡢⠦⡦⠡⡡⠥⡥⠣⡣⠧⡧"+
		"⢠⣠⢤⣤⢢⣢⢦⣦⢡⣡⢥⣥⢣⣣⢧⣧"+
		"⠐⡐⠔⡔⠒⡒⠖⡖⠑⡑⠕⡕⠓⡓⠗⡗"+
		"⢐⣐⢔⣔⢒⣒⢖⣖⢑⣑⢕⣕⢓⣓⢗⣗"+
		"⠰⡰⠴⡴⠲⡲⠶⡶⠱⡱⠵⡵⠳⡳⠷⡷"+
		"⢰⣰⢴⣴⢲⣲⢶⣶⢱⣱⢵⣵⢳⣳⢷⣷"+
		"⠈⡈⠌⡌⠊⡊⠎⡎⠉⡉⠍⡍⠋⡋⠏⡏"+
		"⢈⣈⢌⣌⢊⣊⢎⣎⢉⣉⢍⣍⢋⣋⢏⣏"+
		"⠨⡨⠬⡬⠪⡪⠮⡮⠩⡩⠭⡭⠫⡫⠯⡯"+
		"⢨⣨⢬⣬⢪⣪⢮⣮⢩⣩⢭⣭⢫⣫⢯⣯"+
		"⠘⡘⠜⡜⠚⡚⠞⡞⠙⡙⠝⡝⠛⡛⠟⡟"+
		"⢘⣘⢜⣜⢚⣚⢞⣞⢙⣙⢝⣝⢛⣛⢟⣟"+
		"⠸⡸⠼⡼⠺⡺⠾⡾⠹⡹⠽⡽⠻⡻⠿⡿"+
		"⢸⣸⢼⣼⢺⣺⢾⣾⢹⣹⢽⣽⢻⣻⢿⣿";
	public static char Byt_To_BrAl(byte Byt)
	{
		return switch(Byt)
		{
			/*0*/case (byte)0b0000_0000->'⠀';/*1*/case (byte)0b1000_0000->'⡀';/*2*/case (byte)0b0100_0000->'⠄';/*3*/case (byte)0b1100_0000->'⡄';/*4*/case (byte)0b0010_0000->'⠂';/*5*/case (byte)0b1010_0000->'⡂';/*6*/case (byte)0b0110_0000->'⠆';/*7*/case (byte)0b1110_0000->'⡆';/*8*/case (byte)0b0001_0000->'⠁';/*9*/case (byte)0b1001_0000->'⡁';/*10*/case (byte)0b0101_0000->'⠅';/*11*/case (byte)0b1101_0000->'⡅';/*12*/case (byte)0b0011_0000->'⠃';/*13*/case (byte)0b1011_0000->'⡃';/*14*/case (byte)0b0111_0000->'⠇';/*15*/case (byte)0b1111_0000->'⡇';
			/*16*/case (byte)0b0000_1000->'⢀';/*17*/case (byte)0b1000_1000->'⣀';/*18*/case (byte)0b0100_1000->'⢄';/*19*/case (byte)0b1100_1000->'⣄';/*20*/case (byte)0b0010_1000->'⢂';/*21*/case (byte)0b1010_1000->'⣂';/*22*/case (byte)0b0110_1000->'⢆';/*23*/case (byte)0b1110_1000->'⣆';/*24*/case (byte)0b0001_1000->'⢁';/*25*/case (byte)0b1001_1000->'⣁';/*26*/case (byte)0b0101_1000->'⢅';/*27*/case (byte)0b1101_1000->'⣅';/*28*/case (byte)0b0011_1000->'⢃';/*29*/case (byte)0b1011_1000->'⣃';/*30*/case (byte)0b0111_1000->'⢇';/*31*/case (byte)0b1111_1000->'⣇';
			/*32*/case (byte)0b0000_0100->'⠠';/*33*/case (byte)0b1000_0100->'⡠';/*34*/case (byte)0b0100_0100->'⠤';/*35*/case (byte)0b1100_0100->'⡤';/*36*/case (byte)0b0010_0100->'⠢';/*37*/case (byte)0b1010_0100->'⡢';/*38*/case (byte)0b0110_0100->'⠦';/*39*/case (byte)0b1110_0100->'⡦';/*40*/case (byte)0b0001_0100->'⠡';/*41*/case (byte)0b1001_0100->'⡡';/*42*/case (byte)0b0101_0100->'⠥';/*43*/case (byte)0b1101_0100->'⡥';/*44*/case (byte)0b0011_0100->'⠣';/*45*/case (byte)0b1011_0100->'⡣';/*46*/case (byte)0b0111_0100->'⠧';/*47*/case (byte)0b1111_0100->'⡧';
			/*48*/case (byte)0b0000_1100->'⢠';/*49*/case (byte)0b1000_1100->'⣠';/*50*/case (byte)0b0100_1100->'⢤';/*51*/case (byte)0b1100_1100->'⣤';/*52*/case (byte)0b0010_1100->'⢢';/*53*/case (byte)0b1010_1100->'⣢';/*54*/case (byte)0b0110_1100->'⢦';/*55*/case (byte)0b1110_1100->'⣦';/*56*/case (byte)0b0001_1100->'⢡';/*57*/case (byte)0b1001_1100->'⣡';/*58*/case (byte)0b0101_1100->'⢥';/*59*/case (byte)0b1101_1100->'⣥';/*60*/case (byte)0b0011_1100->'⢣';/*61*/case (byte)0b1011_1100->'⣣';/*62*/case (byte)0b0111_1100->'⢧';/*63*/case (byte)0b1111_1100->'⣧';
			/*64*/case (byte)0b0000_0010->'⠐';/*65*/case (byte)0b1000_0010->'⡐';/*66*/case (byte)0b0100_0010->'⠔';/*67*/case (byte)0b1100_0010->'⡔';/*68*/case (byte)0b0010_0010->'⠒';/*69*/case (byte)0b1010_0010->'⡒';/*70*/case (byte)0b0110_0010->'⠖';/*71*/case (byte)0b1110_0010->'⡖';/*72*/case (byte)0b0001_0010->'⠑';/*73*/case (byte)0b1001_0010->'⡑';/*74*/case (byte)0b0101_0010->'⠕';/*75*/case (byte)0b1101_0010->'⡕';/*76*/case (byte)0b0011_0010->'⠓';/*77*/case (byte)0b1011_0010->'⡓';/*78*/case (byte)0b0111_0010->'⠗';/*79*/case (byte)0b1111_0010->'⡗';
			/*80*/case (byte)0b0000_1010->'⢐';/*81*/case (byte)0b1000_1010->'⣐';/*82*/case (byte)0b0100_1010->'⢔';/*83*/case (byte)0b1100_1010->'⣔';/*84*/case (byte)0b0010_1010->'⢒';/*85*/case (byte)0b1010_1010->'⣒';/*86*/case (byte)0b0110_1010->'⢖';/*87*/case (byte)0b1110_1010->'⣖';/*88*/case (byte)0b0001_1010->'⢑';/*89*/case (byte)0b1001_1010->'⣑';/*90*/case (byte)0b0101_1010->'⢕';/*91*/case (byte)0b1101_1010->'⣕';/*92*/case (byte)0b0011_1010->'⢓';/*93*/case (byte)0b1011_1010->'⣓';/*94*/case (byte)0b0111_1010->'⢗';/*95*/case (byte)0b1111_1010->'⣗';
			/*96*/case (byte)0b0000_0110->'⠰';/*97*/case (byte)0b1000_0110->'⡰';/*98*/case (byte)0b0100_0110->'⠴';/*99*/case (byte)0b1100_0110->'⡴';/*100*/case (byte)0b0010_0110->'⠲';/*101*/case (byte)0b1010_0110->'⡲';/*102*/case (byte)0b0110_0110->'⠶';/*103*/case (byte)0b1110_0110->'⡶';/*104*/case (byte)0b0001_0110->'⠱';/*105*/case (byte)0b1001_0110->'⡱';/*106*/case (byte)0b0101_0110->'⠵';/*107*/case (byte)0b1101_0110->'⡵';/*108*/case (byte)0b0011_0110->'⠳';/*109*/case (byte)0b1011_0110->'⡳';/*110*/case (byte)0b0111_0110->'⠷';/*111*/case (byte)0b1111_0110->'⡷';
			/*112*/case (byte)0b0000_1110->'⢰';/*113*/case (byte)0b1000_1110->'⣰';/*114*/case (byte)0b0100_1110->'⢴';/*115*/case (byte)0b1100_1110->'⣴';/*116*/case (byte)0b0010_1110->'⢲';/*117*/case (byte)0b1010_1110->'⣲';/*118*/case (byte)0b0110_1110->'⢶';/*119*/case (byte)0b1110_1110->'⣶';/*120*/case (byte)0b0001_1110->'⢱';/*121*/case (byte)0b1001_1110->'⣱';/*122*/case (byte)0b0101_1110->'⢵';/*123*/case (byte)0b1101_1110->'⣵';/*124*/case (byte)0b0011_1110->'⢳';/*125*/case (byte)0b1011_1110->'⣳';/*126*/case (byte)0b0111_1110->'⢷';/*127*/case (byte)0b1111_1110->'⣷';
			/*128*/case (byte)0b0000_0001->'⠈';/*129*/case (byte)0b1000_0001->'⡈';/*130*/case (byte)0b0100_0001->'⠌';/*131*/case (byte)0b1100_0001->'⡌';/*132*/case (byte)0b0010_0001->'⠊';/*133*/case (byte)0b1010_0001->'⡊';/*134*/case (byte)0b0110_0001->'⠎';/*135*/case (byte)0b1110_0001->'⡎';/*136*/case (byte)0b0001_0001->'⠉';/*137*/case (byte)0b1001_0001->'⡉';/*138*/case (byte)0b0101_0001->'⠍';/*139*/case (byte)0b1101_0001->'⡍';/*140*/case (byte)0b0011_0001->'⠋';/*141*/case (byte)0b1011_0001->'⡋';/*142*/case (byte)0b0111_0001->'⠏';/*143*/case (byte)0b1111_0001->'⡏';
			/*144*/case (byte)0b0000_1001->'⢈';/*145*/case (byte)0b1000_1001->'⣈';/*146*/case (byte)0b0100_1001->'⢌';/*147*/case (byte)0b1100_1001->'⣌';/*148*/case (byte)0b0010_1001->'⢊';/*149*/case (byte)0b1010_1001->'⣊';/*150*/case (byte)0b0110_1001->'⢎';/*151*/case (byte)0b1110_1001->'⣎';/*152*/case (byte)0b0001_1001->'⢉';/*153*/case (byte)0b1001_1001->'⣉';/*154*/case (byte)0b0101_1001->'⢍';/*155*/case (byte)0b1101_1001->'⣍';/*156*/case (byte)0b0011_1001->'⢋';/*157*/case (byte)0b1011_1001->'⣋';/*158*/case (byte)0b0111_1001->'⢏';/*159*/case (byte)0b1111_1001->'⣏';
			/*160*/case (byte)0b0000_0101->'⠨';/*161*/case (byte)0b1000_0101->'⡨';/*162*/case (byte)0b0100_0101->'⠬';/*163*/case (byte)0b1100_0101->'⡬';/*164*/case (byte)0b0010_0101->'⠪';/*165*/case (byte)0b1010_0101->'⡪';/*166*/case (byte)0b0110_0101->'⠮';/*167*/case (byte)0b1110_0101->'⡮';/*168*/case (byte)0b0001_0101->'⠩';/*169*/case (byte)0b1001_0101->'⡩';/*170*/case (byte)0b0101_0101->'⠭';/*171*/case (byte)0b1101_0101->'⡭';/*172*/case (byte)0b0011_0101->'⠫';/*173*/case (byte)0b1011_0101->'⡫';/*174*/case (byte)0b0111_0101->'⠯';/*175*/case (byte)0b1111_0101->'⡯';
			/*176*/case (byte)0b0000_1101->'⢨';/*177*/case (byte)0b1000_1101->'⣨';/*178*/case (byte)0b0100_1101->'⢬';/*179*/case (byte)0b1100_1101->'⣬';/*180*/case (byte)0b0010_1101->'⢪';/*181*/case (byte)0b1010_1101->'⣪';/*182*/case (byte)0b0110_1101->'⢮';/*183*/case (byte)0b1110_1101->'⣮';/*184*/case (byte)0b0001_1101->'⢩';/*185*/case (byte)0b1001_1101->'⣩';/*186*/case (byte)0b0101_1101->'⢭';/*187*/case (byte)0b1101_1101->'⣭';/*188*/case (byte)0b0011_1101->'⢫';/*189*/case (byte)0b1011_1101->'⣫';/*190*/case (byte)0b0111_1101->'⢯';/*191*/case (byte)0b1111_1101->'⣯';
			/*192*/case (byte)0b0000_0011->'⠘';/*193*/case (byte)0b1000_0011->'⡘';/*194*/case (byte)0b0100_0011->'⠜';/*195*/case (byte)0b1100_0011->'⡜';/*196*/case (byte)0b0010_0011->'⠚';/*197*/case (byte)0b1010_0011->'⡚';/*198*/case (byte)0b0110_0011->'⠞';/*199*/case (byte)0b1110_0011->'⡞';/*200*/case (byte)0b0001_0011->'⠙';/*201*/case (byte)0b1001_0011->'⡙';/*202*/case (byte)0b0101_0011->'⠝';/*203*/case (byte)0b1101_0011->'⡝';/*204*/case (byte)0b0011_0011->'⠛';/*205*/case (byte)0b1011_0011->'⡛';/*206*/case (byte)0b0111_0011->'⠟';/*207*/case (byte)0b1111_0011->'⡟';
			/*208*/case (byte)0b0000_1011->'⢘';/*209*/case (byte)0b1000_1011->'⣘';/*210*/case (byte)0b0100_1011->'⢜';/*211*/case (byte)0b1100_1011->'⣜';/*212*/case (byte)0b0010_1011->'⢚';/*213*/case (byte)0b1010_1011->'⣚';/*214*/case (byte)0b0110_1011->'⢞';/*215*/case (byte)0b1110_1011->'⣞';/*216*/case (byte)0b0001_1011->'⢙';/*217*/case (byte)0b1001_1011->'⣙';/*218*/case (byte)0b0101_1011->'⢝';/*219*/case (byte)0b1101_1011->'⣝';/*220*/case (byte)0b0011_1011->'⢛';/*221*/case (byte)0b1011_1011->'⣛';/*222*/case (byte)0b0111_1011->'⢟';/*223*/case (byte)0b1111_1011->'⣟';
			/*224*/case (byte)0b0000_0111->'⠸';/*225*/case (byte)0b1000_0111->'⡸';/*226*/case (byte)0b0100_0111->'⠼';/*227*/case (byte)0b1100_0111->'⡼';/*228*/case (byte)0b0010_0111->'⠺';/*229*/case (byte)0b1010_0111->'⡺';/*230*/case (byte)0b0110_0111->'⠾';/*231*/case (byte)0b1110_0111->'⡾';/*232*/case (byte)0b0001_0111->'⠹';/*233*/case (byte)0b1001_0111->'⡹';/*234*/case (byte)0b0101_0111->'⠽';/*235*/case (byte)0b1101_0111->'⡽';/*236*/case (byte)0b0011_0111->'⠻';/*237*/case (byte)0b1011_0111->'⡻';/*238*/case (byte)0b0111_0111->'⠿';/*239*/case (byte)0b1111_0111->'⡿';
			/*240*/case (byte)0b0000_1111->'⢸';/*241*/case (byte)0b1000_1111->'⣸';/*242*/case (byte)0b0100_1111->'⢼';/*243*/case (byte)0b1100_1111->'⣼';/*244*/case (byte)0b0010_1111->'⢺';/*245*/case (byte)0b1010_1111->'⣺';/*246*/case (byte)0b0110_1111->'⢾';/*247*/case (byte)0b1110_1111->'⣾';/*248*/case (byte)0b0001_1111->'⢹';/*249*/case (byte)0b1001_1111->'⣹';/*250*/case (byte)0b0101_1111->'⢽';/*251*/case (byte)0b1101_1111->'⣽';/*252*/case (byte)0b0011_1111->'⢻';/*253*/case (byte)0b1011_1111->'⣻';/*254*/case (byte)0b0111_1111->'⢿';/*255*/case (byte)0b1111_1111->'⣿';
			default->throw new IllegalStateException("Unexpected value:"+Byt);
		};
	}
		public static char[] Byt_To_BrAl(byte[] Byt)
		{
			char[] BrAl=new char[Byt.length];
			for(int IndX=0;
				IndX<Byt.length;
				IndX+=1)
			{BrAl[IndX]=Byt_To_BrAl(Byt[IndX]);}

			return BrAl;
		}
	public static byte BrAl_To_Byt(char BrAl)
	{
		return switch(BrAl)
		{
			/*0*/case '⠀'->(byte)0b0000_0000;/*1*/case '⡀'->(byte)0b1000_0000;/*2*/case '⠄'->(byte)0b1000_0000;/*3*/case '⡄'->(byte)0b1100_0000;/*4*/case '⠂'->(byte)0b0010_0000;/*5*/case '⡂'->(byte)0b1010_0000;/*6*/case '⠆'->(byte)0b0110_0000;/*7*/case '⡆'->(byte)0b1110_0000;/*8*/case '⠁'->(byte)0b0001_0000;/*9*/case '⡁'->(byte)0b1001_0000;/*10*/case '⠅'->(byte)0b0101_0000;/*11*/case '⡅'->(byte)0b1101_0000;/*12*/case '⠃'->(byte)0b0011_0000;/*13*/case '⡃'->(byte)0b1011_0000;/*14*/case '⠇'->(byte)0b0111_0000;/*15*/case '⡇'->(byte)0b1111_0000;
			/*16*/case '⢀'->(byte)0b0000_1000;/*17*/case '⣀'->(byte)0b1000_1000;/*18*/case '⢄'->(byte)0b0100_1000;/*19*/case '⣄'->(byte)0b1100_1000;/*20*/case '⢂'->(byte)0b0010_1000;/*21*/case '⣂'->(byte)0b1010_1000;/*22*/case '⢆'->(byte)0b0110_1000;/*23*/case '⣆'->(byte)0b1110_1000;/*24*/case '⢁'->(byte)0b0001_1000;/*25*/case '⣁'->(byte)0b0001_1000;/*26*/case '⢅'->(byte)0b0101_1000;/*27*/case '⣅'->(byte)0b1101_1000;/*28*/case '⢃'->(byte)0b0011_1000;/*29*/case '⣃'->(byte)0b1011_1000;/*30*/case '⢇'->(byte)0b0111_1000;/*31*/case '⣇'->(byte)0b1111_1000;
			/*32*/case '⠠'->(byte)0b0000_0100;/*33*/case '⡠'->(byte)0b1000_0100;/*34*/case '⠤'->(byte)0b0100_0100;/*35*/case '⡤'->(byte)0b1100_0100;/*36*/case '⠢'->(byte)0b0010_0100;/*37*/case '⡢'->(byte)0b1010_0100;/*38*/case '⠦'->(byte)0b0110_0100;/*39*/case '⡦'->(byte)0b1110_0100;/*40*/case '⠡'->(byte)0b0001_0100;/*41*/case '⡡'->(byte)0b1001_0100;/*42*/case '⠥'->(byte)0b0101_0100;/*43*/case '⡥'->(byte)0b1101_0100;/*44*/case '⠣'->(byte)0b0011_0100;/*45*/case '⡣'->(byte)0b1011_0100;/*46*/case '⠧'->(byte)0b0111_0100;/*47*/case '⡧'->(byte)0b1111_0100;
			/*48*/case '⢠'->(byte)0b0000_1100;/*49*/case '⣠'->(byte)0b1000_1100;/*50*/case '⢤'->(byte)0b0100_1100;/*51*/case '⣤'->(byte)0b1100_1100;/*52*/case '⢢'->(byte)0b0010_1100;/*53*/case '⣢'->(byte)0b1010_1100;/*54*/case '⢦'->(byte)0b0110_1100;/*55*/case '⣦'->(byte)0b1110_1100;/*56*/case '⢡'->(byte)0b0001_1100;/*57*/case '⣡'->(byte)0b1001_1100;/*58*/case '⢥'->(byte)0b0101_1100;/*59*/case '⣥'->(byte)0b1101_1100;/*60*/case '⢣'->(byte)0b0011_1100;/*61*/case '⣣'->(byte)0b1011_1100;/*62*/case '⢧'->(byte)0b0111_1100;/*63*/case '⣧'->(byte)0b1111_1100;
			/*64*/case '⠐'->(byte)0b0000_0010;/*65*/case '⡐'->(byte)0b1000_0010;/*66*/case '⠔'->(byte)0b0100_0010;/*67*/case '⡔'->(byte)0b1100_0010;/*68*/case '⠒'->(byte)0b0010_0010;/*69*/case '⡒'->(byte)0b1010_0010;/*70*/case '⠖'->(byte)0b0110_0010;/*71*/case '⡖'->(byte)0b1110_0010;/*72*/case '⠑'->(byte)0b0001_0010;/*73*/case '⡑'->(byte)0b1001_0010;/*74*/case '⠕'->(byte)0b0101_0010;/*75*/case '⡕'->(byte)0b1101_0010;/*76*/case '⠓'->(byte)0b0011_0010;/*77*/case '⡓'->(byte)0b1011_0010;/*78*/case '⠗'->(byte)0b0111_0010;/*79*/case '⡗'->(byte)0b1111_0010;
			/*80*/case '⢐'->(byte)0b0000_1010;/*81*/case '⣐'->(byte)0b1000_1010;/*82*/case '⢔'->(byte)0b0100_1010;/*83*/case '⣔'->(byte)0b1100_1010;/*84*/case '⢒'->(byte)0b0010_1010;/*85*/case '⣒'->(byte)0b1010_1010;/*86*/case '⢖'->(byte)0b0110_1010;/*87*/case '⣖'->(byte)0b1110_1010;/*88*/case '⢑'->(byte)0b1110_1010;/*89*/case '⣑'->(byte)0b1001_1010;/*90*/case '⢕'->(byte)0b0101_1010;/*91*/case '⣕'->(byte)0b1101_1010;/*92*/case '⢓'->(byte)0b0011_1010;/*93*/case '⣓'->(byte)0b1011_1010;/*94*/case '⢗'->(byte)0b0111_1010;/*95*/case '⣗'->(byte)0b1111_1010;
			/*96*/case '⠰'->(byte)0b0000_0110;/*97*/case '⡰'->(byte)0b1000_0110;/*98*/case '⠴'->(byte)0b0100_0110;/*99*/case '⡴'->(byte)0b1100_0110;/*100*/case '⠲'->(byte)0b0010_0110;/*101*/case '⡲'->(byte)0b1010_0110;/*102*/case '⠶'->(byte)0b0110_0110;/*103*/case '⡶'->(byte)0b1110_0110;/*104*/case '⠱'->(byte)0b0001_0110;/*105*/case '⡱'->(byte)0b1001_0110;/*106*/case '⠵'->(byte)0b0101_0110;/*107*/case '⡵'->(byte)0b0101_0110;/*108*/case '⠳'->(byte)0b0011_0110;/*109*/case '⡳'->(byte)0b1011_0110;/*110*/case '⠷'->(byte)0b0111_0110;/*111*/case '⡷'->(byte)0b1111_0110;
			/*112*/case '⢰'->(byte)0b0000_1110;/*113*/case '⣰'->(byte)0b1000_1110;/*114*/case '⢴'->(byte)0b0100_1110;/*115*/case '⣴'->(byte)0b1100_1110;/*116*/case '⢲'->(byte)0b0010_1110;/*117*/case '⣲'->(byte)0b1010_1110;/*118*/case '⢶'->(byte)0b0110_1110;/*119*/case '⣶'->(byte)0b1110_1110;/*120*/case '⢱'->(byte)0b0001_1110;/*121*/case '⣱'->(byte)0b1001_1110;/*122*/case '⢵'->(byte)0b0101_1110;/*123*/case '⣵'->(byte)0b1101_1110;/*124*/case '⢳'->(byte)0b0011_1110;/*125*/case '⣳'->(byte)0b1011_1110;/*126*/case '⢷'->(byte)0b0111_1110;/*127*/case '⣷'->(byte)0b1111_1110;
			/*128*/case '⠈'->(byte)0b0000_0001;/*129*/case '⡈'->(byte)0b1000_0001;/*130*/case '⠌'->(byte)0b0100_0001;/*131*/case '⡌'->(byte)0b1100_0001;/*132*/case '⠊'->(byte)0b0010_0001;/*133*/case '⡊'->(byte)0b1010_0001;/*134*/case '⠎'->(byte)0b0110_0001;/*135*/case '⡎'->(byte)0b1110_0001;/*136*/case '⠉'->(byte)0b0001_0001;/*137*/case '⡉'->(byte)0b1001_0001;/*138*/case '⠍'->(byte)0b0101_0001;/*139*/case '⡍'->(byte)0b1101_0001;/*140*/case '⠋'->(byte)0b0011_0001;/*141*/case '⡋'->(byte)0b1011_0001;/*142*/case '⠏'->(byte)0b0111_0001;/*143*/case '⡏'->(byte)0b1111_0001;
			/*144*/case '⢈'->(byte)0b0000_1001;/*145*/case '⣈'->(byte)0b1000_1001;/*146*/case '⢌'->(byte)0b0100_1001;/*147*/case '⣌'->(byte)0b1100_1001;/*148*/case '⢊'->(byte)0b0010_1001;/*149*/case '⣊'->(byte)0b1010_1001;/*150*/case '⢎'->(byte)0b0110_1001;/*151*/case '⣎'->(byte)0b1110_1001;/*152*/case '⢉'->(byte)0b0001_1001;/*153*/case '⣉'->(byte)0b1001_1001;/*154*/case '⢍'->(byte)0b0101_1001;/*155*/case '⣍'->(byte)0b1101_1001;/*156*/case '⢋'->(byte)0b0011_1001;/*157*/case '⣋'->(byte)0b1011_1001;/*158*/case '⢏'->(byte)0b0111_1001;/*159*/case '⣏'->(byte)0b1111_1001;
			/*160*/case '⠨'->(byte)0b0000_0101;/*161*/case '⡨'->(byte)0b1000_0101;/*162*/case '⠬'->(byte)0b0100_0101;/*163*/case '⡬'->(byte)0b1100_0101;/*164*/case '⠪'->(byte)0b0010_0101;/*165*/case '⡪'->(byte)0b1010_0101;/*166*/case '⠮'->(byte)0b0110_0101;/*167*/case '⡮'->(byte)0b1110_0101;/*168*/case '⠩'->(byte)0b0001_0101;/*169*/case '⡩'->(byte)0b1001_0101;/*170*/case '⠭'->(byte)0b0101_0101;/*171*/case '⡭'->(byte)0b1101_0101;/*172*/case '⠫'->(byte)0b0011_0101;/*173*/case '⡫'->(byte)0b1011_0101;/*174*/case '⠯'->(byte)0b0111_0101;/*175*/case '⡯'->(byte)0b1111_0101;
			/*176*/case '⢨'->(byte)0b0000_1101;/*177*/case '⣨'->(byte)0b1000_1101;/*178*/case '⢬'->(byte)0b0100_1101;/*179*/case '⣬'->(byte)0b1100_1101;/*180*/case '⢪'->(byte)0b0010_1101;/*181*/case '⣪'->(byte)0b1010_1101;/*182*/case '⢮'->(byte)0b0110_1101;/*183*/case '⣮'->(byte)0b1110_1101;/*184*/case '⢩'->(byte)0b0001_1101;/*185*/case '⣩'->(byte)0b1001_1101;/*186*/case '⢭'->(byte)0b0101_1101;/*187*/case '⣭'->(byte)0b1101_1101;/*188*/case '⢫'->(byte)0b0011_1101;/*189*/case '⣫'->(byte)0b1011_1101;/*190*/case '⢯'->(byte)0b0111_1101;/*191*/case '⣯'->(byte)0b1111_1101;
			/*192*/case '⠘'->(byte)0b0000_0011;/*193*/case '⡘'->(byte)0b1000_0011;/*194*/case '⠜'->(byte)0b0100_0011;/*195*/case '⡜'->(byte)0b1100_0011;/*196*/case '⠚'->(byte)0b0010_0011;/*197*/case '⡚'->(byte)0b1010_0011;/*198*/case '⠞'->(byte)0b0110_0011;/*199*/case '⡞'->(byte)0b1110_0011;/*200*/case '⠙'->(byte)0b0001_0011;/*201*/case '⡙'->(byte)0b1001_0011;/*202*/case '⠝'->(byte)0b0101_0011;/*203*/case '⡝'->(byte)0b1101_0011;/*204*/case '⠛'->(byte)0b0011_0011;/*205*/case '⡛'->(byte)0b1011_0011;/*206*/case '⠟'->(byte)0b0111_0011;/*207*/case '⡟'->(byte)0b1111_0011;
			/*208*/case '⢘'->(byte)0b0000_1011;/*209*/case '⣘'->(byte)0b1000_1011;/*210*/case '⢜'->(byte)0b0100_1011;/*211*/case '⣜'->(byte)0b1100_1011;/*212*/case '⢚'->(byte)0b0010_1011;/*213*/case '⣚'->(byte)0b1010_1011;/*214*/case '⢞'->(byte)0b0110_1011;/*215*/case '⣞'->(byte)0b1110_1011;/*216*/case '⢙'->(byte)0b0001_1011;/*217*/case '⣙'->(byte)0b1001_1011;/*218*/case '⢝'->(byte)0b0101_1011;/*219*/case '⣝'->(byte)0b1101_1011;/*220*/case '⢛'->(byte)0b0011_1011;/*221*/case '⣛'->(byte)0b1011_1011;/*222*/case '⢟'->(byte)0b0111_1011;/*223*/case '⣟'->(byte)0b1111_1011;
			/*224*/case '⠸'->(byte)0b0000_0111;/*225*/case '⡸'->(byte)0b1000_0111;/*226*/case '⠼'->(byte)0b0100_0111;/*227*/case '⡼'->(byte)0b1100_0111;/*228*/case '⠺'->(byte)0b0010_0111;/*229*/case '⡺'->(byte)0b1010_0111;/*230*/case '⠾'->(byte)0b0110_0111;/*231*/case '⡾'->(byte)0b1110_0111;/*232*/case '⠹'->(byte)0b0001_0111;/*233*/case '⡹'->(byte)0b1001_0111;/*234*/case '⠽'->(byte)0b0101_0111;/*235*/case '⡽'->(byte)0b1101_0111;/*236*/case '⠻'->(byte)0b0011_0111;/*237*/case '⡻'->(byte)0b1011_0111;/*238*/case '⠿'->(byte)0b0111_0111;/*239*/case '⡿'->(byte)0b1111_0111;
			/*240*/case '⢸'->(byte)0b0000_1111;/*241*/case '⣸'->(byte)0b1000_1111;/*242*/case '⢼'->(byte)0b0100_1111;/*243*/case '⣼'->(byte)0b1100_1111;/*244*/case '⢺'->(byte)0b0010_1111;/*245*/case '⣺'->(byte)0b1010_1111;/*246*/case '⢾'->(byte)0b0110_1111;/*247*/case '⣾'->(byte)0b0110_1111;/*248*/case '⢹'->(byte)0b0001_1111;/*249*/case '⣹'->(byte)0b1001_1111;/*250*/case '⢽'->(byte)0b0101_1111;/*251*/case '⣽'->(byte)0b1101_1111;/*252*/case '⢻'->(byte)0b0011_1111;/*253*/case '⣻'->(byte)0b1011_1111;/*254*/case '⢿'->(byte)0b0111_1111;/*255*/case '⣿'->(byte)0b1111_1111;
			default->throw new IllegalStateException("Unexpected value:"+BrAl);
		};
	}
		public static byte[] BrAl_To_Byt(char[] BrAl)
		{
			byte[] Byt=new byte[BrAl.length];
			for(int IndX=0;
				IndX<BrAl.length;
				IndX+=1)
			{Byt[IndX]=BrAl_To_Byt(BrAl[IndX]);}

			return Byt;
		}
	public static String String_To_BrAl(String String)
	{return Text.Chr_Ara_To_String(Byt_To_BrAl(String.getBytes()));}

	public static HashMap<String,Object> KE_List=new HashMap<>();
		public static void Ad_Ke(Object KE,String NAm)
		{KE_List.put(NAm,KE);}

	/*static
	{
		Braille_Byt=new Bilateral_Hash_Map_Plus(Braille_To_Byt,Byt_To_Braille);
		Hexdec_To_Byt=new HashMap();
		Byt_To_Hexdec=new HashMap();
		HXdec_Byt=new Bilateral_Hash_Map_Plus(Hexdec_To_Byt,Byt_To_Hexdec);
		HXdec_Byt.put("00",(Byt)0);
		HXdec_Byt.put("01",-128);
		HXdec_Byt.put("02",(Byt)64);
		HXdec_Byt.put("03",-64);
		HXdec_Byt.put("04",(Byt)32);
		HXdec_Byt.put("05",-96);
		HXdec_Byt.put("06",(Byt)96);
		HXdec_Byt.put("07",-32);
		HXdec_Byt.put("08",(Byt)16);
		HXdec_Byt.put("09",-112);
		HXdec_Byt.put("0A",(Byt)80);
		HXdec_Byt.put("0B",-48);
		HXdec_Byt.put("0C",(Byt)48);
		HXdec_Byt.put("0D",-80);
		HXdec_Byt.put("0E",(Byt)112);
		HXdec_Byt.put("0F",-16);
		HXdec_Byt.put("10",(Byt)8);
		HXdec_Byt.put("11",-120);
		HXdec_Byt.put("12",(Byt)72);
		HXdec_Byt.put("13",-56);
		HXdec_Byt.put("14",(Byt)40);
		HXdec_Byt.put("15",-88);
		HXdec_Byt.put("16",(Byt)104);
		HXdec_Byt.put("17",-24);
		HXdec_Byt.put("18",(Byt)24);
		HXdec_Byt.put("19",-104);
		HXdec_Byt.put("1A",(Byt)88);
		HXdec_Byt.put("1B",-40);
		HXdec_Byt.put("1C",(Byt)56);
		HXdec_Byt.put("1D",-72);
		HXdec_Byt.put("1E",(Byt)120);
		HXdec_Byt.put("1F",-8);
		HXdec_Byt.put("20",(Byt)4);
		HXdec_Byt.put("21",-124);
		HXdec_Byt.put("22",(Byt)68);
		HXdec_Byt.put("23",-60);
		HXdec_Byt.put("24",(Byt)36);
		HXdec_Byt.put("25",-92);
		HXdec_Byt.put("26",(Byt)100);
		HXdec_Byt.put("27",-28);
		HXdec_Byt.put("28",(Byt)28);
		HXdec_Byt.put("29",-108);
		HXdec_Byt.put("2A",(Byt)84);
		HXdec_Byt.put("2B",-44);
		HXdec_Byt.put("2C",(Byt)52);
		HXdec_Byt.put("2D",-76);
		HXdec_Byt.put("2E",(Byt)116);
		HXdec_Byt.put("2F",-12);
		HXdec_Byt.put("30",(Byt)12);
		HXdec_Byt.put("31",-116);
		HXdec_Byt.put("32",(Byt)76);
		HXdec_Byt.put("33",-52);
		HXdec_Byt.put("34",(Byt)44);
		HXdec_Byt.put("35",-84);
		HXdec_Byt.put("36",(Byt)108);
		HXdec_Byt.put("37",-20);
		HXdec_Byt.put("38",(Byt)28);
		HXdec_Byt.put("39",-100);
		HXdec_Byt.put("3A",(Byt)92);
		HXdec_Byt.put("3B",-36);
		HXdec_Byt.put("3C",(Byt)60);
		HXdec_Byt.put("3D",-68);
		HXdec_Byt.put("3E",(Byt)124);
		HXdec_Byt.put("3F",-4);
		HXdec_Byt.put("40",(Byt)2);
		HXdec_Byt.put("41",-126);
		HXdec_Byt.put("42",(Byt)66);
		HXdec_Byt.put("43",-62);
		HXdec_Byt.put("44",(Byt)34);
		HXdec_Byt.put("45",-94);
		HXdec_Byt.put("46",(Byt)98);
		HXdec_Byt.put("47",-30);
		HXdec_Byt.put("48",(Byt)22);
		HXdec_Byt.put("49",-110);
		HXdec_Byt.put("4A",(Byt)82);
		HXdec_Byt.put("4B",-46);
		HXdec_Byt.put("4C",(Byt)50);
		HXdec_Byt.put("4D",-78);
		HXdec_Byt.put("4E",(Byt)114);
		HXdec_Byt.put("4F",-14);
		HXdec_Byt.put("50",(Byt)10);
		HXdec_Byt.put("51",-118);
		HXdec_Byt.put("52",(Byt)74);
		HXdec_Byt.put("53",-54);
		HXdec_Byt.put("54",(Byt)42);
		HXdec_Byt.put("55",-86);
		HXdec_Byt.put("56",(Byt)106);
		HXdec_Byt.put("57",-22);
		HXdec_Byt.put("58",(Byt)26);
		HXdec_Byt.put("59",-102);
		HXdec_Byt.put("5A",(Byt)90);
		HXdec_Byt.put("5B",-38);
		HXdec_Byt.put("5C",(Byt)58);
		HXdec_Byt.put("5D",-70);
		HXdec_Byt.put("5E",(Byt)122);
		HXdec_Byt.put("5F",-6);
		HXdec_Byt.put("60",(Byt)6);
		HXdec_Byt.put("61",-122);
		HXdec_Byt.put("62",(Byt)70);
		HXdec_Byt.put("63",-58);
		HXdec_Byt.put("64",(Byt)38);
		HXdec_Byt.put("65",-90);
		HXdec_Byt.put("66",(Byt)102);
		HXdec_Byt.put("67",-26);
		HXdec_Byt.put("68",(Byt)22);
		HXdec_Byt.put("69",-106);
		HXdec_Byt.put("6A",(Byt)86);
		HXdec_Byt.put("6B",-42);
		HXdec_Byt.put("6C",(Byt)54);
		HXdec_Byt.put("6D",-74);
		HXdec_Byt.put("6E",(Byt)118);
		HXdec_Byt.put("6F",-10);
		HXdec_Byt.put("70",(Byt)14);
		HXdec_Byt.put("71",-114);
		HXdec_Byt.put("72",(Byt)78);
		HXdec_Byt.put("73",-50);
		HXdec_Byt.put("74",(Byt)46);
		HXdec_Byt.put("75",-82);
		HXdec_Byt.put("76",(Byt)110);
		HXdec_Byt.put("77",-18);
		HXdec_Byt.put("78",(Byt)30);
		HXdec_Byt.put("79",-98);
		HXdec_Byt.put("7A",(Byt)94);
		HXdec_Byt.put("7B",-34);
		HXdec_Byt.put("7C",(Byt)62);
		HXdec_Byt.put("7D",-66);
		HXdec_Byt.put("7E",(Byt)126);
		HXdec_Byt.put("7F",-2);
		HXdec_Byt.put("80",(Byt)1);
		HXdec_Byt.put("81",-127);
		HXdec_Byt.put("82",(Byt)65);
		HXdec_Byt.put("83",-63);
		HXdec_Byt.put("84",(Byt)33);
		HXdec_Byt.put("85",-95);
		HXdec_Byt.put("86",(Byt)97);
		HXdec_Byt.put("87",-31);
		HXdec_Byt.put("88",(Byt)17);
		HXdec_Byt.put("89",-111);
		HXdec_Byt.put("8A",(Byt)81);
		HXdec_Byt.put("8B",-47);
		HXdec_Byt.put("8C",(Byt)49);
		HXdec_Byt.put("8D",-79);
		HXdec_Byt.put("8E",(Byt)113);
		HXdec_Byt.put("8F",-15);
		HXdec_Byt.put("90",(Byt)9);
		HXdec_Byt.put("91",-119);
		HXdec_Byt.put("92",(Byt)73);
		HXdec_Byt.put("93",-55);
		HXdec_Byt.put("94",(Byt)41);
		HXdec_Byt.put("95",-87);
		HXdec_Byt.put("96",(Byt)105);
		HXdec_Byt.put("97",-23);
		HXdec_Byt.put("98",(Byt)25);
		HXdec_Byt.put("99",-103);
		HXdec_Byt.put("9A",(Byt)89);
		HXdec_Byt.put("9B",-39);
		HXdec_Byt.put("9C",(Byt)57);
		HXdec_Byt.put("9D",-71);
		HXdec_Byt.put("9E",(Byt)121);
		HXdec_Byt.put("9F",-7);
		HXdec_Byt.put("A0",(Byt)5);
		HXdec_Byt.put("A1",-123);
		HXdec_Byt.put("A2",(Byt)69);
		HXdec_Byt.put("A3",-59);
		HXdec_Byt.put("A4",(Byt)37);
		HXdec_Byt.put("A5",-91);
		HXdec_Byt.put("A6",(Byt)101);
		HXdec_Byt.put("A7",-27);
		HXdec_Byt.put("A8",(Byt)21);
		HXdec_Byt.put("A9",-107);
		HXdec_Byt.put("AA",(Byt)85);
		HXdec_Byt.put("AB",-43);
		HXdec_Byt.put("AC",(Byt)53);
		HXdec_Byt.put("AD",-75);
		HXdec_Byt.put("AE",(Byt)117);
		HXdec_Byt.put("AF",-11);
		HXdec_Byt.put("B0",(Byt)13);
		HXdec_Byt.put("B1",-115);
		HXdec_Byt.put("B2",(Byt)77);
		HXdec_Byt.put("B3",-51);
		HXdec_Byt.put("B4",(Byt)45);
		HXdec_Byt.put("B5",-83);
		HXdec_Byt.put("B6",(Byt)109);
		HXdec_Byt.put("B7",-19);
		HXdec_Byt.put("B8",(Byt)29);
		HXdec_Byt.put("B9",-99);
		HXdec_Byt.put("BA",(Byt)93);
		HXdec_Byt.put("BB",-35);
		HXdec_Byt.put("BC",(Byt)61);
		HXdec_Byt.put("BD",-67);
		HXdec_Byt.put("BE",(Byt)125);
		HXdec_Byt.put("BF",-3);
		HXdec_Byt.put("C0",(Byt)3);
		HXdec_Byt.put("C1",-125);
		HXdec_Byt.put("C2",(Byt)67);
		HXdec_Byt.put("C3",-61);
		HXdec_Byt.put("C4",(Byt)35);
		HXdec_Byt.put("C5",-93);
		HXdec_Byt.put("C6",(Byt)99);
		HXdec_Byt.put("C7",-29);
		HXdec_Byt.put("C8",(Byt)19);
		HXdec_Byt.put("C9",-109);
		HXdec_Byt.put("CA",(Byt)83);
		HXdec_Byt.put("CB",-45);
		HXdec_Byt.put("CC",(Byt)51);
		HXdec_Byt.put("CD",-77);
		HXdec_Byt.put("CE",(Byt)115);
		HXdec_Byt.put("CF",-13);
		HXdec_Byt.put("D0",(Byt)11);
		HXdec_Byt.put("D1",-117);
		HXdec_Byt.put("D2",(Byt)75);
		HXdec_Byt.put("D3",-53);
		HXdec_Byt.put("D4",(Byt)43);
		HXdec_Byt.put("D5",-85);
		HXdec_Byt.put("D6",(Byt)107);
		HXdec_Byt.put("D7",-21);
		HXdec_Byt.put("D8",(Byt)27);
		HXdec_Byt.put("D9",-101);
		HXdec_Byt.put("DA",(Byt)91);
		HXdec_Byt.put("DB",-37);
		HXdec_Byt.put("DC",(Byt)59);
		HXdec_Byt.put("DD",-69);
		HXdec_Byt.put("DE",(Byt)123);
		HXdec_Byt.put("DF",-5);
		HXdec_Byt.put("E0",(Byt)7);
		HXdec_Byt.put("E1",-121);
		HXdec_Byt.put("E2",(Byt)71);
		HXdec_Byt.put("E3",-57);
		HXdec_Byt.put("E4",(Byt)39);
		HXdec_Byt.put("E5",-89);
		HXdec_Byt.put("E6",(Byt)103);
		HXdec_Byt.put("E7",-25);
		HXdec_Byt.put("E8",(Byt)23);
		HXdec_Byt.put("E9",-105);
		HXdec_Byt.put("EA",(Byt)87);
		HXdec_Byt.put("EB",-41);
		HXdec_Byt.put("EC",(Byt)55);
		HXdec_Byt.put("ED",-73);
		HXdec_Byt.put("EE",(Byt)119);
		HXdec_Byt.put("EF",-9);
		HXdec_Byt.put("F0",(Byt)15);
		HXdec_Byt.put("F1",-113);
		HXdec_Byt.put("F2",(Byt)79);
		HXdec_Byt.put("F3",-49);
		HXdec_Byt.put("F4",(Byt)47);
		HXdec_Byt.put("F5",-81);
		HXdec_Byt.put("F6",(Byt)111);
		HXdec_Byt.put("F7",-17);
		HXdec_Byt.put("F8",(Byt)31);
		HXdec_Byt.put("F9",-97);
		HXdec_Byt.put("FA",(Byt)95);
		HXdec_Byt.put("FB",-33);
		HXdec_Byt.put("FC",(Byt)63);
		HXdec_Byt.put("FD",-65);
		HXdec_Byt.put("FE",(Byt)127);
		HXdec_Byt.put("FF",-1);
	}*/

	public static TXt_Tran Prim=TXt_Tran.Get("BrAl");

	public static class Bin_Pan implements Com_Havr
	{
		static{Init_StRt(Bin_Pan.class);}

		public static final Clas_Rap Class=null;

		public Bin_Pan(){}

		public JSplitPane Pane=new JSplitPane(HORIZONTAL_SPLIT);
			@Override public JSplitPane Com(){return Pane;}
		public JPanel But_Pan=new JPanel(), Feld_Pan=new JPanel();
			public JTextField A=new JTextField(16),B=new JTextField(16),Out=new JTextField(16),Tran=new JTextField(16);
			{
				Feld_Pan.add(A);
				Feld_Pan.add(B);
				Feld_Pan.add(Out);
				Feld_Pan.add(Tran);
				Pane.setLeftComponent(Feld_Pan);
				Pane.setRightComponent(But_Pan);
				Ad_But(But_Pan,
					(Runnable)()->Out.setText(Prim.Up(A.getText(),parseByte(B.getText()))),">",
					(Runnable)()->Out.setText(Prim.Down(A.getText(),parseByte(B.getText()))),"<",
					(Runnable)()->Out.setText(Prim.Rev(A.getText())),"↶",
					(Runnable)()->Out.setText(Prim.Or(A.getText(),B.getText())),"|",
					(Runnable)()->Out.setText(Prim.And(A.getText(),B.getText())),"&",
					(Runnable)()->Out.setText(Prim.XOr(A.getText(),B.getText())),"^",
					(Runnable)()->Out.setText(Prim.Not(A.getText())),"!"
				);
			}

		public static String Title="Binary";

		static{Init_Nd(Bin_Pan.class);}
	}

	static
	{
		out.println("⏞Bi test");

		long StRt=nanoTime();
		byte P=0b0101_1001,P_=(byte)0b1001_1011;
		ArrayList<Long> A=new ArrayList<>(10000);
		/*for(int L=0;L<100;L+=1)
		{
			for(int Index=0;Index<1000000;Index+=1){P=
				//reverse
				//Rev
				Rev__
					(P);}
			A.add(nanoTime()-StRt);
		}/**/
		//out.println("Time="+Add_Long(A)/10000);
		//out.println("Add="+_01(P)+","+_01(P_)+","+_01(Add_U_L(P,P_)));

		//ByteBuffer;
		//out.println(_01(Reverse));
//		float P__=0b1000_0000_0000_0000_0000_0000_0000_0000;
//		out.println("Flot="+_01(floatToRawIntBits(P__)));
//		out.println(_01(P__));

		int P____=P|P_,Sum=P^P_,Carry=P&P_;
		while(Carry!=0)
		{
			Carry>>>=1;
			Sum^=Carry;
			;
		}
		out.println("Add_Test="+0);

		out.println("⏟Bin test");
	}
}