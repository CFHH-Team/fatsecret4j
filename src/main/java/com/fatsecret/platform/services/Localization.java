/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fatsecret.platform.services;

/**
 * This contains Localization enumerations for Region and Language
 *
 * @author CFHH-Team
 * @version 2.0
 */
public class Localization {
	
	/** Region */	
	public enum Region {
		AF,AL,DZ,AS,AD,AO,AG,AR,AM,AW,AU,AT,AZ,BS,BH,BD,BB,BY,BE,BZ,BJ,
		BM,BT,BO,BA,BW,BR,BN,BG,BF,BI,KH,CM,CA,CV,KY,CF,TD,CL,CN,CO,KM,
		CG,CR,HR,CU,CY,CZ,CD,DK,DJ,DM,DO,EC,EG,SV,GQ,ER,EE,ET,FO,FJ,FI,
		FR,GF,PF,GA,GM,GE,DE,GH,GR,GL,GD,GP,GU,GT,GG,GN,GW,GY,HT,HN,HK,
		HU,IS,IN,ID,IE,IM,IL,IT,CI,JM,JP,JE,JO,KZ,KE,KI,KR,KW,KG,LA,LV,
		LB,LS,LR,LY,LI,LT,LU,MO,MK,MG,MW,MY,MV,ML,MT,MH,MQ,MR,MU,YT,MX,
		FM,MD,MC,MN,ME,MA,MZ,MM,NA,NP,NL,AN,NC,NZ,NI,NE,NG,MP,NO,OM,PK,
		PA,PG,PY,PE,PH,PL,PT,PR,QA,RE,RO,RU,RW,KN,LC,MF,VC,WS,SM,ST,SA,
		SN,RS,SC,SL,SG,SK,SI,SB,SO,ZA,ES,LK,SR,SZ,SE,CH,SY,TW,TJ,TZ,TH,
		TL,TG,TO,TT,TN,TR,TM,TC,UG,UA,AE,GB,US,UY,UZ,VU,VE,VN,VI,EH,YE,
		ZM,ZW;	
	};
	
	/** Language */	
	public enum Language {
		ar,
		zh,	
		zh_TW ("zh-TW"),
		da,
		nl,
		en,
		en_CA ("en-CA"),
		en_UK ("en-UK"),
		fi,
		fr,
		de,
		id,
		it,
		ja,
		ko,
		nb,
		pl,
		pt,
		pt_PT ("pt-PT"),
		ru,
		es,
		sv,
		tr;
		
	    private final String string;

	    private Language(String code) {
	        this.string = code;
	       
	    };
	    
	    private Language() {
	    	this.string = this.name();
	    }
	    
	    @Override
	    public String toString() {
	    	return string;
	    }
	}
}
