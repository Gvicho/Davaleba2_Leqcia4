package com.example.davaleba2_leqcia4

class Reader() {
    val kavshiriDa :String = "და"
    val enumMap: Map<Int, Ricxvi> = Ricxvi.values().associateBy { it.warmoadgens}


    public fun transform(arr:Array<Int>):String{
        var ans :String= ""
        var l = arr.size
        for(i in l-1 downTo  0){
            if(i==3){
                ans += enumMap[1000]!!.fudze
                break
            }else if(i==2){
                if(arr[i]!=1){
                    ans += enumMap[arr[i]]!!.fudze
                }

                ans += enumMap[100]!!.fudze

                if(arr[1]==0 && arr[0]==0) ans += enumMap[100]!!.bolo
            }else if(i==1){
                if(arr[i]==0)continue
                if(arr[i]==1 && arr[0]==0){
                    ans += enumMap[10]!!.fudze
                    continue
                }
                if(arr[i] != 1){
                    ans += enumMap[arr[i]*10]!!.fudze
                }
                if(arr[0]==0) ans += enumMap[arr[i]*10]!!.bolo
            }else{
                if(arr[i]==0)continue
                if(l>=2 && arr[1]%2==1){
                    ans += enumMap[10+arr[i]]!!.fudze
                }else{
                    if(l>=2 && arr[1]!=0)ans += kavshiriDa
                    ans += enumMap[arr[i]]!!.fudze
                    ans += enumMap[arr[i]]!!.bolo
                }
            }
        }
        return ans
    }

    enum class Ricxvi(val fudze:String,val bolo:String, val warmoadgens:Int){
        ERTI("ერთი","",1),
        ORI("ორ","ი",2),
        SAMI("სამ","ი",3),
        OTXI("ოთხ","ი",4),
        XUTI("ხუთ","ი",5),
        EQVSI("ექვს" ,"ი",6),
        SHVIDI("შვიდ","ი",7),
        RVA("რვა","",8),
        CXRA("ცხრა","",9),

        ATI("ათი","",10),

        TERTMET("თერთმეტი","",11),
        TORMET("თორმეტი","",12),
        CAMET("ცამეტი","",13),
        TOTXMET("თოთხმეტი","",14),
        TXUTMET("თხუთმეტი","",15),
        TEQVSMET("თექვსმეტი","",16),
        CHVIDMET("ჩვიდმეტი","",17),
        TVRAMET("თვრამეტი","",18),
        CXRAMET("ცხრამეტი","",19),

        OCI("ოც","ი",20),
        OCDAATI("ოცდა","ათი",30),
        ORMOCI("ორმოც","ი",40),
        ORMOCDAATI("ორმოცდა","ათი",50),
        SAMOCI("სამოც","ი",60),
        SAMOCDAATI("სამოცდა","ათი",70),
        OTXMOCI("ოთხმოც","ი",80),
        OTXMOCDAATI("ოთხმოცდა","ათი",90),

        ASI("ას","ი",100),

        ATASI("ათასი","",1000)
    }

}
