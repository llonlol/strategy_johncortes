package mian;
import abstracts.warrior;
import abstracts.avatar;
import characters.fire_lord;
import characters.fire_prince;
import characters.kioshi_warrior;
import characters.southerntribe_bender;
import characters.southerntribe_warrior;
import characters.theavatar;
import characters.blind_bandit;

public class main {
	public static void main(String[] args) {
		warrior ozai=new fire_lord();
		warrior zuko=new fire_prince();
		warrior suki=new kioshi_warrior();
		warrior katara=new southerntribe_bender();
		warrior sokka=new southerntribe_warrior();
		warrior toph=new blind_bandit();
		avatar aang=new theavatar();
		
		System.out.println("*oh no it's the evil fire lord*");
		ozai.performattack();
		System.out.println("");
		System.out.println("*the whole team avatar attacks*");
		zuko.performattack();
		katara.performattack();
		toph.performattack();
		suki.performattack();
		sokka.performattack();
		System.out.println("");
		System.out.println("*it´s not very effective...*");
		zuko.performrush();
		katara.performrush();
		toph.performrush();
		suki.performrush();
		sokka.performrush();
		System.out.println("");
		System.out.println("*but right before losing all hope aang enters the avatar state*");
		aang.performattack();
		System.out.println("");
		System.out.println("*alright that's it*");
	}
}
