package CC.Encycloped.Abs.Org.Comput.Bi;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Nam.Nam_Havr_Abs;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Stat_Ovr;

public abstract class Translator<Type> extends Nam_Havr_Abs.Nam_Havr
{
	public static final Clas_Rap Class=Init_StRt(Translator.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Type[] List;
		public void Set_List(Type[] List){this.List=List;}
		public Type[] Get_List(){return List;}

	public abstract Object Tran(byte Bin);
		@Stat_Ovr
		public static Object Tran(byte Bin,String Name){return null;}
//	public abstract Object Tran(short Bin);
//	public abstract Object Tran(int Bin);
//	public abstract Object Tran(long Bin);

	static{
		Init_Nd(Translator.class);}
}