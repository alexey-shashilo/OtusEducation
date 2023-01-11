package org.lecture.lecture14;

public class Oktmo {
    private int ID;    //Уникальный идентификатор строки в таблице
    private String Kod; //	Код территориального образования (например, 20 613 416 152)
    private String Kod2; //	Код территориального образования без пробелов (например, 20613416152)
    private String SubKod1; //	Первый блок из 2-х цифр кода территориального образования (например, 20)
    private String SubKod2; //	Второй блок из 3-х цифр кода территориального образования (например, 613)
    private String SubKod3;    //Третий блок из 3-х цифр кода территориального образования (например, 416)
    private String SubKod4;    //Четвёртый блок из 3-х цифр кода территориального образования (например, 152)
    private String P1;    //Третья цифра в коде территориального образования (например, 6)
    private String P2;    //Шестая цифра в коде территориального образования (например, 4)
    private String Kch;    //Контрольное число
    private String Name;    //Наименование территориального образования (например, "- Никитинское" или "Городские поселения Новодеревеньковского муниципального района/")
    private String Name2;    //То же, что и Name, но удалены дефис в начале и слэш в конце (например, "Никитинское" или "Городские поселения Новодеревеньковского муниципального района")
    private String Notes;    //Дополнительные данные
    private String FederalDistrictID;    //Идентификатор федерального округа (можно связать с таблицей FederalDistricts)
    private String FederalDistrictName;    //Наименование федерального округа
    private String RegionID;    //Идентификатор края/области (можно связать с таблицей Regions)
    private String RegionName;    //Наименование края/области
    private int SettlementTypeID;    //Идентификатор типа населённорго пункта (можно связать с таблицей SettlementTypes)
    private String settlementTypeName;    //Наименование типа населённорго пункта
    private int parentIdKod;
    private int oldIdKod;

    public Oktmo(int id, String kod, String kod2, String subKod1, String subKod2, String subKod3, String subKod4, String p1, String p2, String kch, String name, String name2, String notes, String federalDistrictID, String federalDistrictName, String regionID, String regionName, int settlementTypeID, String settlementTypeName) {
        ID = id;
        Kod = kod;
        Kod2 = kod2;
        SubKod1 = subKod1;
        SubKod2 = subKod2;
        SubKod3 = subKod3;
        SubKod4 = subKod4;
        P1 = p1;
        P2 = p2;
        Kch = kch;
        Name = name;
        Name2 = name2;
        Notes = notes;
        FederalDistrictID = federalDistrictID;
        FederalDistrictName = federalDistrictName;
        RegionID = regionID;
        RegionName = regionName;
        SettlementTypeID = settlementTypeID;
        settlementTypeName = settlementTypeName;
    }

    @Override
    public String toString() {
        return "Oktmo{" + "ID=" + ID + ", Kod='" + Kod + '\'' + ", Kod2='" + Kod2 + '\'' + ", SubKod1='" + SubKod1 + '\'' + ", SubKod2='" + SubKod2 + '\'' + ", SubKod3='" + SubKod3 + '\'' + ", SubKod4='" + SubKod4 + '\'' + ", P1='" + P1 + '\'' + ", P2='" + P2 + '\'' + ", Kch='" + Kch + '\'' + ", Name='" + Name + '\'' + ", Name2='" + Name2 + '\'' + ", Notes='" + Notes + '\'' + ", FederalDistrictID='" + FederalDistrictID + '\'' + ", FederalDistrictName='" + FederalDistrictName + '\'' + ", RegionID='" + RegionID + '\'' + ", RegionName='" + RegionName + '\'' + ", SettlementTypeID=" + SettlementTypeID + ", SettlementTypeName='" + settlementTypeName + '\'' + ", parentIdKod=" + parentIdKod + ", oldIdKod=" + oldIdKod + '}';
    }
}
