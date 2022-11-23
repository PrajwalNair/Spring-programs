package com.xworkz.soil.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.soil.entity.Air;
import com.xworkz.soil.entity.Ant;
import com.xworkz.soil.entity.Apple;
import com.xworkz.soil.entity.Fan;
import com.xworkz.soil.entity.Human;
import com.xworkz.soil.entity.Light;
import com.xworkz.soil.entity.Mirror;
import com.xworkz.soil.entity.SoilEntity;
import com.xworkz.soil.entity.Wire;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("running spring configuration");

	}

	public SoilEntity soilEntity() {
		SoilEntity entity = new SoilEntity();
		System.out.println("SoilEntity method is running");
		return entity;
	}

	public Ant ant() {
		Ant entity = new Ant();
		System.out.println("Ant method is running");
		return entity;
	}

	public Apple apple() {
		Apple entity = new Apple();
		System.out.println("Apple method is running");
		return entity;
	}

	public Light light() {
		Light entity = new Light();
		System.out.println("Light method is running");
		return entity;
	}

	public Human human() {
		Human entity = new Human();
		System.out.println("Human method is running");
		return entity;
	}

	@Bean
	public Mirror mirror() {
		Mirror entity = new Mirror();
		System.out.println("Mirror method is running");
		return entity;
	}

	public Fan fan() {
		Fan entity = new Fan();
		System.out.println("Fan method is running");
		return entity;
	}

	public Wire wire() {
		Wire entity = new Wire();
		System.out.println("Wire method is running");
		return entity;
	}

	public Air air() {
		Air entity = new Air();
		System.out.println("Fan method is running");
		return entity;
	}

	@Bean
	public String name() {
		String string = new String();
		return "suhas";
	}

	@Bean
	public String name1() {
		String string = new String();
		return "manohar";
	}

	@Bean
	public String name2() {
		String string = new String();
		return "hanamant";
	}

	@Bean
	public String name3() {
		String string = new String();
		return "basavaraj";
	}

	@Bean
	public String name4() {
		String string = new String();
		return "Sharath";
	}

	@Bean
	public String name5() {
		String string = new String();
		return "dharshan";
	}

	@Bean
	public String name6() {
		String string = new String();
		return "malatesh";
	}

	@Bean
	public String name7() {
		String string = new String();
		return "chandru";
	}

	@Bean
	public String name8() {
		String string = new String();
		return "sachin";
	}

	@Bean
	public String name9() {
		String string = new String();
		return "manoj";
	}

	@Bean
	public String car() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car1() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car2() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car3() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car4() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car5() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car6() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car7() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car8() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car9() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car10() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car11() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car12() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car13() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car14() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car15() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car16() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car17() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car18() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car19() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car20() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car21() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car22() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car23() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car24() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car25() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car26() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car27() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car28() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car29() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car30() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car31() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car32() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car33() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car34() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car35() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car36() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car37() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car38() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car39() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car40() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car41() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car42() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car43() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car44() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car45() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car46() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car47() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car48() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car49() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car50() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car51() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car52() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car53() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car54() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car55() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car56() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car57() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car58() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car59() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car60() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car61() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car62() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car63() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car64() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car65() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car66() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car67() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car68() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car69() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car70() {
		String string = new String();
		return "bmw c220d";
	}

	@Bean
	public String car71() {
		String string = new String();
		return "mahindra xuv700";
	}

	@Bean
	public String car72() {
		String string = new String();
		return "mahindra bolero";
	}

	@Bean
	public String car73() {
		String string = new String();
		return "ford fiesta";
	}

	@Bean
	public String car74() {
		String string = new String();
		return "fiat punto";
	}

	@Bean
	public String car75() {
		String string = new String();
		return "chavrolett";
	}

	@Bean
	public String car76() {
		String string = new String();
		return "tata nexon";
	}

	@Bean
	public String car77() {
		String string = new String();
		return "tata nexa";
	}

	@Bean
	public String car78() {
		String string = new String();
		return "tata safari";
	}

	@Bean
	public String car79() {
		String string = new String();
		return "rolls royce phantom";
	}

	@Bean
	public String car80() {
		String string = new String();
		return "lamborgini urus";
	}

	@Bean
	public String car81() {
		String string = new String();
		return "tata ev";
	}

	@Bean
	public String car82() {
		String string = new String();
		return "skoda octavia";
	}

	@Bean
	public String car83() {
		String string = new String();
		return "skoda kodiaq";
	}

	@Bean
	public String car84() {
		String string = new String();
		return "skoda slavia";
	}

	@Bean
	public String car85() {
		String string = new String();
		return "skoda fabia";
	}

	@Bean
	public String car86() {
		String string = new String();
		return "skoda karoq";
	}

	@Bean
	public String car87() {
		String string = new String();
		return "volkswagen polo gt";
	}

	@Bean
	public String car88() {
		String string = new String();
		return "range rover";
	}

	@Bean
	public String car89() {
		String string = new String();
		return "land rover";
	}

	@Bean
	public String car90() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car91() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car92() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car93() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car94() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car95() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car96() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car97() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car98() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car99() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car100() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car101() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car102() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car103() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car104() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car105() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car106() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car107() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car108() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car109() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car110() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car111() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car112() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car113() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car114() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car115() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car116() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car117() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car118() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car119() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car120() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car121() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car122() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car123() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car124() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car125() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car126() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car127() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car128() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car129() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car130() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car131() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car132() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car133() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car134() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car135() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car136() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car137() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car138() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car139() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car140() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car141() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car142() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car143() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car144() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car145() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car146() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car147() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car148() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car149() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car150() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car151() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car152() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car153() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car154() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car155() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car156() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car157() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car158() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car159() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car160() {
		String string = new String();
		return "bmw c220d";
	}

	@Bean
	public String car161() {
		String string = new String();
		return "mahindra xuv700";
	}

	@Bean
	public String car162() {
		String string = new String();
		return "mahindra bolero";
	}

	@Bean
	public String car163() {
		String string = new String();
		return "ford fiesta";
	}

	@Bean
	public String car164() {
		String string = new String();
		return "fiat punto";
	}

	@Bean
	public String car165() {
		String string = new String();
		return "chavrolett";
	}

	@Bean
	public String car166() {
		String string = new String();
		return "tata nexon";
	}

	@Bean
	public String car167() {
		String string = new String();
		return "tata nexa";
	}

	@Bean
	public String car168() {
		String string = new String();
		return "tata safari";
	}

	@Bean
	public String car169() {
		String string = new String();
		return "rolls royce phantom";
	}

	@Bean
	public String car170() {
		String string = new String();
		return "lamborgini urus";
	}

	@Bean
	public String car171() {
		String string = new String();
		return "tata ev";
	}

	@Bean
	public String car172() {
		String string = new String();
		return "skoda octavia";
	}

	@Bean
	public String car173() {
		String string = new String();
		return "skoda kodiaq";
	}

	@Bean
	public String car174() {
		String string = new String();
		return "skoda slavia";
	}

	@Bean
	public String car175() {
		String string = new String();
		return "skoda fabia";
	}

	@Bean
	public String car176() {
		String string = new String();
		return "skoda karoq";
	}

	@Bean
	public String car177() {
		String string = new String();
		return "volkswagen polo gt";
	}

	@Bean
	public String car178() {
		String string = new String();
		return "range rover";
	}

	@Bean
	public String car179() {
		String string = new String();
		return "land rover";
	}
	
	@Bean
	public String car180() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car181() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car182() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car183() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car184() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car185() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car186() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car187() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car188() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car189() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car190() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car191() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car192() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car193() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car194() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car195() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car196() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car197() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car198() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car199() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car200() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car201() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car202() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car203() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car204() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car205() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car206() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car207() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car208() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car209() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car210() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car211() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car212() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car213() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car214() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car215() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car216() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car217() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car218() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car219() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car220() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car221() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car222() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car223() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car224() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car225() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car226() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car227() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car228() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car229() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car230() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car231() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car232() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car233() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car234() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car235() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car236() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car237() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car238() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car239() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car240() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car241() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car242() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car243() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car244() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car245() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car246() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car247() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car248() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car249() {
		String string = new String();
		return "bmw c220d";
	}

	@Bean
	public String car250() {
		String string = new String();
		return "mahindra xuv700";
	}

	@Bean
	public String car251() {
		String string = new String();
		return "mahindra bolero";
	}

	@Bean
	public String car252() {
		String string = new String();
		return "ford fiesta";
	}

	@Bean
	public String car253() {
		String string = new String();
		return "fiat punto";
	}

	@Bean
	public String car254() {
		String string = new String();
		return "chavrolett";
	}

	@Bean
	public String car255() {
		String string = new String();
		return "tata nexon";
	}

	@Bean
	public String car256() {
		String string = new String();
		return "tata nexa";
	}

	@Bean
	public String car257() {
		String string = new String();
		return "tata safari";
	}

	@Bean
	public String car258() {
		String string = new String();
		return "rolls royce phantom";
	}

	@Bean
	public String car259() {
		String string = new String();
		return "lamborgini urus";
	}

	@Bean
	public String car260() {
		String string = new String();
		return "tata ev";
	}

	@Bean
	public String car261() {
		String string = new String();
		return "skoda octavia";
	}

	@Bean
	public String car262() {
		String string = new String();
		return "skoda kodiaq";
	}

	@Bean
	public String car263() {
		String string = new String();
		return "skoda slavia";
	}

	@Bean
	public String car264() {
		String string = new String();
		return "skoda fabia";
	}

	@Bean
	public String car265() {
		String string = new String();
		return "skoda karoq";
	}

	@Bean
	public String car266() {
		String string = new String();
		return "volkswagen polo gt";
	}

	@Bean
	public String car267() {
		String string = new String();
		return "range rover";
	}

	@Bean
	public String car268() {
		String string = new String();
		return "land rover";
	}

	@Bean
	public String car269() {
		String string = new String();
		return "maruti 800";
	}

	@Bean
	public String car270() {
		String string = new String();
		return "maruti zen";
	}

	@Bean
	public String car271() {
		String string = new String();
		return "nexon";
	}

	@Bean
	public String car272() {
		String string = new String();
		return "maruti alto";
	}

	@Bean
	public String car273() {
		String string = new String();
		return "kia";
	}

	@Bean
	public String car274() {
		String string = new String();
		return "renault duster";
	}

	@Bean
	public String car275() {
		String string = new String();
		return "enova";
	}

	@Bean
	public String car276() {
		String string = new String();
		return "scorpio";
	}

	@Bean
	public String car277() {
		String string = new String();
		return "mahindra tuv 300";
	}

	@Bean
	public String car278() {
		String string = new String();
		return "waganor";
	}

	@Bean
	public String car279() {
		String string = new String();
		return "Omini";
	}

	@Bean
	public String car280() {
		String string = new String();
		return "ford endeavour";
	}

	@Bean
	public String car281() {
		String string = new String();
		return "benz";
	}

	@Bean
	public String car282() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car283() {
		String string = new String();
		return "ertiga";
	}

	@Bean
	public String car284() {
		String string = new String();
		return "etois";
	}

	@Bean
	public String car285() {
		String string = new String();
		return "lamborgini";
	}

	@Bean
	public String car286() {
		String string = new String();
		return "mustang";
	}

	@Bean
	public String car287() {
		String string = new String();
		return "ferari";
	}

	@Bean
	public String car288() {
		String string = new String();
		return "bugati";
	}

	@Bean
	public String car289() {
		String string = new String();
		return "audi";
	}

	@Bean
	public String car290() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car291() {
		String string = new String();
		return "nano";
	}

	@Bean
	public String car292() {
		String string = new String();
		return "i20 aasta";
	}

	@Bean
	public String car293() {
		String string = new String();
		return "i20 sports";
	}

	@Bean
	public String car294() {
		String string = new String();
		return "honda city";
	}

	@Bean
	public String car295() {
		String string = new String();
		return "honda amaze";
	}

	@Bean
	public String car296() {
		String string = new String();
		return "ambasador";
	}

	@Bean
	public String car297() {
		String string = new String();
		return "feat";
	}

	@Bean
	public String car298() {
		String string = new String();
		return "cruzer";
	}

	@Bean
	public String car299() {
		String string = new String();
		return "thar";
	}

	@Bean
	public String car300() {
		String string = new String();
		return "honda fit";
	}

	@Bean
	public String car301() {
		String string = new String();
		return "volkswagon";
	}

	@Bean
	public String car302() {
		String string = new String();
		return "toyota";
	}

	@Bean
	public String car303() {
		String string = new String();
		return "ferari testarossa";
	}

	@Bean
	public String car304() {
		String string = new String();
		return "tavera";
	}

	@Bean
	public String car305() {
		String string = new String();
		return "indica";
	}

	@Bean
	public String car306() {
		String string = new String();
		return "indica v2";
	}

	@Bean
	public String car307() {
		String string = new String();
		return "Breeza";
	}

	@Bean
	public String car308() {
		String string = new String();
		return "porche";
	}

	@Bean
	public String car309() {
		String string = new String();
		return "polo";
	}

	@Bean
	public String car310() {
		String string = new String();
		return "fortuner";
	}

	@Bean
	public String car311() {
		String string = new String();
		return "indigo";
	}

	@Bean
	public String car312() {
		String string = new String();
		return "lexus";
	}

	@Bean
	public String car313() {
		String string = new String();
		return "swift";
	}

	@Bean
	public String car314() {
		String string = new String();
		return "swift dezire";
	}

	@Bean
	public String car315() {
		String string = new String();
		return "echo";
	}

	@Bean
	public String car316() {
		String string = new String();
		return "audi r8";
	}

	@Bean
	public String car317() {
		String string = new String();
		return "MG hector";
	}

	@Bean
	public String car318() {
		String string = new String();
		return "Carnival";
	}

	@Bean
	public String car319() {
		String string = new String();
		return "carens";
	}

	@Bean
	public String car320() {
		String string = new String();
		return "volkswagen vento";
	}

	@Bean
	public String car321() {
		String string = new String();
		return "volkswagen jetta";
	}

	@Bean
	public String car322() {
		String string = new String();
		return "skoda rapid";
	}

	@Bean
	public String car323() {
		String string = new String();
		return "volkswagen virtus";
	}

	@Bean
	public String car324() {
		String string = new String();
		return "volkswagen taigun";
	}

	@Bean
	public String car325() {
		String string = new String();
		return "skoda superb";
	}

	@Bean
	public String car326() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car327() {
		String string = new String();
		return "skoda kushaq";
	}

	@Bean
	public String car328() {
		String string = new String();
		return "maruti s-presso";
	}

	@Bean
	public String car329() {
		String string = new String();
		return "celerio";
	}

	@Bean
	public String car330() {
		String string = new String();
		return "maruti santner";
	}

	@Bean
	public String car331() {
		String string = new String();
		return "maruti ignis";
	}

	@Bean
	public String car332() {
		String string = new String();
		return "audi q3";
	}

	@Bean
	public String car333() {
		String string = new String();
		return "audi q5";
	}

	@Bean
	public String car334() {
		String string = new String();
		return "audi q8";
	}

	@Bean
	public String car335() {
		String string = new String();
		return "audi a3";
	}

	@Bean
	public String car336() {
		String string = new String();
		return "audi a5";
	}

	@Bean
	public String car337() {
		String string = new String();
		return "audi a8";
	}

	@Bean
	public String car338() {
		String string = new String();
		return "bmw 220d";
	}

	@Bean
	public String car339() {
		String string = new String();
		return "bmw c220d";
	}

	@Bean
	public String car340() {
		String string = new String();
		return "mahindra xuv700";
	}

	@Bean
	public String car341() {
		String string = new String();
		return "mahindra bolero";
	}

	@Bean
	public String car342() {
		String string = new String();
		return "ford fiesta";
	}

	@Bean
	public String car343() {
		String string = new String();
		return "fiat punto";
	}

	@Bean
	public String car344() {
		String string = new String();
		return "chavrolett";
	}

	
	

}
