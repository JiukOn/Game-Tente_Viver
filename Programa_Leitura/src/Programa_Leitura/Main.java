package Programa_Leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	
		try (Scanner in = new Scanner(System.in)) {
			String nome;
			String comando;
			Random rand = new Random();
			
			System.out.println("Bem vindo(a) ao 'jogo' insira seu nome:");
			nome = in.nextLine();
			System.out.println("Seja bem vindo(a) " + nome);
			System.out.println("Qual dire��o deseja ir? (w,a,s,d)");
			comando = in.nextLine();
			if (comando.equals ("w")) {
				System.out.println("Voc� esta indo para a frente");
				System.out.println("Um inimigo surgiu, oque deseja fazer? (a = atacar, c = correr)");
				comando = in.nextLine();
				if (comando.equals("a")) {
					if(rand.nextInt(100) < 75) {
						System.out.println("Voc� ganhou a luta!");
						System.out.println("oque quer fazer agora? q = se matar e= andar para frente r= ir para o proximo mapa");
						comando = in.nextLine();
						if(comando.equals("q")) {
							System.out.println("PORQUEEEE? Nem sofreu no game ainda");
							if(rand.nextInt(100) < 50) {
								System.out.println("Ningu�m quer sua alma vai ficar vivo");
								System.out.println("Ainda quer morrer? q = sim e = n�o");
								comando = in.nextLine();
								if(comando.equals("q")) {
								if(rand.nextInt(100) < 30) {
									System.out.println("HAHAHAHAH vai ficar vivo HAHHAHAH sou muito malvad�o");
									System.out.println("Ainda quer morrer? q = sim e = n�o");
									comando = in.nextLine();
									if(comando.equals("q")) {
										if(rand.nextInt(100) < 10) {
											System.out.println("MORRE LOGO DESGRA�A.");
										}else {
											System.out.println("Sobe logo vai, desisto.");
										}
									}
									if(comando.equals("e")) {
										System.out.println("AGORA VAI MORRER SIM HAHAHAHAHHA");
									}
								}else {
									System.out.println("Era t�o jovem :)");
									
								}
							}else {
								System.out.println("Era t�o jovem : 0");
								}
								if(comando.equals("e")) {
									System.out.println("AGORA VAI MORRER SIM HAHAHAHAHHA");
								}
									
							}else {
								System.out.println("Era t�o jovem : /");
							}
						}else if(comando.equals("e")) {
							System.out.println("Voc� caiu num buraco, reinicie o jogo : /");
						}else if(comando.equals("r")) {
							System.out.println("Voc� entrou no mapa 2-A");
							System.out.println("Esse mapa � territorio das chamas");
							System.out.println("A temperatura � muito alta");
						System.out.println("Voc� trouxe protetor solar? q = sim e = n�o");
						comando = in.nextLine();
						 if(comando.equals("q")) {
							 System.out.println("Mentiroso, eu sou deus taligado?");
							 System.out.println("tentou mentir pra deus n�...");
							 System.out.println("AVISO: UM RAIO CAIU EM VOC� E AGORA EST� MORTO, REINICIE O JOGO HAUAHAUAHUA...");
						 }else if(comando.equals("e")) {
							 System.out.println("Voc� torrou e morreu");
						 }
						}
					}else {
						System.out.println("Voc� perdeu a luta e acabou morrendo, reinicie o jogo : /");
					}
				}else if(comando.equals("c")) {
					if(rand.nextInt(100) < 90) {
						System.out.println("voc� correu e est� indo para outro mapa...");
						System.out.println("Voc� chegou no mapa 1-C, Uma terra pacifica na maior parte do tempo");
						System.out.println("Uma garotinha esta chorando, oque vai fazer? q = ajudar  e = ignorar");
						comando = in.nextLine();
						if (comando.equals("q")) {
							System.out.println(nome + ": Por que esta chorando garotinha?");
							System.out.println("Garota: Aquele homem roubou meus doces...");
							System.out.println("Garota: Voc� pode me ajudar, te darei uma recompensa q = sim w = opa, que recompensa? e = n�o");
							comando = in.nextLine();
							if (comando.equals("q")) {
								System.out.println("Deus aprovou sua atitude");
								System.out.println("Garota: EBA!! tambom agora pegue o saco daquele homem os doces est�o l�");
								if(rand.nextInt(100) < 35) {
									System.out.println("Garota: ESSE SACO N�O!!");
									System.out.println("Deus te odeia por fazer coisas obcenas nas frente de uma garotinha");
									System.out.println("O homem te voltou um soco e voc� caiu desmaiado");
									System.out.println("Aviso: um raio caiu em sua regi�o mais sensivel");
									System.out.println("Voc� morreu por n�o suportar a dor");
								}else {
									System.out.println("Homem: AI QUAL FOI MALUCO?!");
									System.out.println("Esses doces n�o s�o seus, n�o tire doces de crian�a seu maldito!!");
									System.out.println("Deus gostou de sua atitude");
									System.out.println("Homem: E?? OQUE VOC� VAI FAZER EIN??");
									System.out.println("oque deseja fazer? q = correr desesperadamente w = se matar e = lutar");
									comando = in.nextLine();
									if (comando.equals("q")) {
										System.out.println("Deus n�o gostou de sua atitude nadinha");
										System.out.println("o homem te seguiu e derrubou o saco de doces");
										System.out.println("A garotinha conseguiu seus doces de volta");
										System.out.println("Enquanto corria voc� trope�ou e caiu com o olho em um grande lapis que estava de p� exatamente onde voc� caiu e voc� morreu");
										System.out.println("O homem trope�ou no seu cadaver e um elefante escorreu em cima dele");
									}else if (comando.equals("w")) {
										System.out.println("Voc� que se matar na frente da garotinha???");
										System.out.println("Deus te odeia");
										System.out.println("Voc� foi teleportado para a boca de um vulc�o amarrado em um espeto");
										System.out.println("Voc� morreu assado enquando canibais colocavam tempero no seu corpo");
									}else if (comando.equals("e")) {
										System.out.println("Deus adorou a sua escolha!");
										System.out.println("O homem sacou um revolver e atirou em sua dire��o");
										if(rand.nextInt(100) < 15) {
											System.out.println("O tiro te acertou mas deus teleportou voc� e o homem para o monte everest");
											System.out.println("Bom a garotinha n�o podia ver isso n�?");
											System.out.println("Ambos morreram congelados");
										}else {
											System.out.println("O tiro n�o te acertou e fez o homem cambalear pelo ricoxete da arma");
											System.out.println("Voc� seguiu na dire��o do homem");
											System.out.println("Oque deseja fazeer? q = matar o homem com um caco de vidro e = tentar apagar o homem");
											comando = in.nextLine();
											if (comando.equals("q")) {
												System.out.println("N�o na frente da menina n� caraio!");
												System.out.println("Voc� e o homem foram mandados para saturno e morreram envenenados");
											}else if (comando.equals("e")) {
												System.out.println("Voc� tirou seu sapato e lan�ou na dire��o do cara");
												System.out.println("O homem desmaiou com o cheiro do seu chul�");
												System.out.println("Deus se divertiu com sua atitude HUAHAUA");
												System.out.println("Garota: Oque aconteceu com ele?");
												System.out.println(nome + ": Ele dormiu porque ficou cansado de ser um homem mau");
												System.out.println("Garota: ent�o tabom");
												System.out.println("Voc� entregou o pacote de doces para a garota");
												System.out.println("Garota: Obrigado mo�o, agora posso comer meus doces que eu peguei da mam�e, ela sempre me disse que era um barato a hora que ela comia eles hehe!");
												System.out.println(nome + ":aaaa... bom... aproveite... mas... acho melhor voc� devolver para sua m�e e perguntar se s�o os doces certos tabom?");
												System.out.println("Garota: Ok, vou ver com a mam�e se esses s�o os doces dela, espero que ela n�o fique brava");
												System.out.println("Deus aprovou muito sua atitude");
												System.out.println("Ok, voc� foi uma pessoa muito honravel por isso te ofere�o um milagre");
												System.out.println("hmmm... que milagre? pera, deus? � voc�?");
												System.out.println("Sim sou eu seu animal de teta, qual milagre fala ai");
												System.out.println("hmmm");
												System.out.println("oque deseja? q = viver pacificamente w = ser o novo deus e = ver a face de deus");
												comando = in.nextLine();
												if (comando.equals("q")) {
													System.out.println("ok eu te concedo esse milagre... prilinpinpin pacificamente at� o fim!");
													System.out.println("ap�s isso voc� fez toda sua aventura e incrivelmente nada aconteceu para te atrapalhar");
													System.out.println("Voc� achou um jarro e vendeu ele por milh�es e desde ent�o nunca mais precisou trabalhar");
													System.out.println("Voc� se casou com uma dama que para voc� era a mais bela e elegante do mundo apesar de deus discordar disso com ela toda desengon�ada do jeito que era mas fazer oque � o amor n�");
													System.out.println("Voc�s tiveram uma vida pacifica juntos e construiram uma familia feliz e saudavel");
													System.out.println("no momento de sua morte todos que voc� amava estavam ao seu redor");
													System.out.println("Aviso: deus esta neste local");
													System.out.println("voc� foi uma pessoa horanvel caro amigo, sinto muito por ter uma vida t�o curta como humano, por isso essa vai ser sua segunda chance");
													System.out.println("Voc� recebeu uma chance de renascer");
													System.out.println("Voc� morreu, pode tentar novamente");
												}else if (comando.equals("w")) {
													System.out.println("Nossa!! Por essa eu n�o esperava, mas beleza");
													System.out.println("Esse � o codigo do universo");
													System.out.println("https://github.com/JiukOn/Game_oUniversoN-oTeQuer");
													System.out.println("Aviso: Voc� � deus e o antigo deus sumiu");
													System.out.println("voc� n�o pode mais morrer...");
												}else if (comando.equals("e")) {
													System.out.println("Beleza, mas isso ser� doloroso");
													System.out.println("Essa � a face de deus: https://linktr.ee/jiukon");
													System.out.println("Voc� morreu pois a face de deus � bela demais para um simples mortal");
												}
											}
										}
									}
								}
							}else if (comando.equals("w")) {
								System.out.println("COMO ASSIM TU TA PEDINDO QUAL A RECOMPENSA PARA ESSA LINDA GAROTINHA, RENAS�A E FA�A OQUE ELA PEDIR SEM PENSAR NA PR�XIMA VEZ");
								System.out.println("Voc� virou presunto");
							}else if (comando.equals("e")) {
								System.out.println("n�o vo quero nem saber mais s� morre");
								System.out.println("Aviso: deus te odeia muito");
								System.out.println("Aviso: um furac�o surgiu com voc� no centro e voc� foi jogado a 30 metros de altura");
								System.out.println("Voc� morreu de queda e seu cadaver parece uma pomba atropelada");
							}
							
						}else if (comando.equals("e")) {
						   if(rand.nextInt(100) < 5) {
							   System.out.println("O universo n�o gostou da sua atitude e voc� foi atingido por um raio,e faleceu, AJUDA A MININA SEU VAGABUNDO");
						   }else {
							   System.out.println("voc� IGNOROU a GAROTINHAZINHA KAWAII ONII-CHAN com INFELIZMENTE sucesso...");
							   System.out.println("agora oque o VAGABUNDO(a) do(a) " + nome + "quer fazer agora?");
							   System.out.println("q = se matar e = luta contra 500 inimigos e leva um raio");
							   comando = in.nextLine();
							   if(comando.equals("q")) {
								   System.out.println("com prazer...");
							   }else if(comando.equals("e")) {
								   if(rand.nextInt(100) < 20) {
									   System.out.println("Voc� lutou contra 500 e sobreviveu, ainda por cima sobreviveu a um raio divino nessa vida meu deus");
									   System.out.println("Agora deus te odeia voc� deseja continuar a aventura? q = morte dolorosa e sangrenta ou e = uma aventura nivel master god hard");
									   comando = in.nextLine();
									   if(comando.equals("q")) {
										   System.out.println("Deus agrade�a sua falta de vida... ; )");
									   }else if(comando.equals("e")) {
										   System.out.println(" Namoral eu ia te deixar morrer s� com umas mordida de porco mas agora tu vai sofrer...");
										   System.out.println(" Aviso: um vulc�o surgiu do seu lado e uma bomba at�mica est� caindo em sua dire��o");
										   if(rand.nextInt(100) < 70) {
											   System.out.println(" Voc� perdeu sua perna");   	
											   if(rand.nextInt(100) < 70) {
												   System.out.println(" Voc� perdeu seus bra�os");   
												   if(rand.nextInt(100) < 70) {
													   System.out.println(" Voc� perdeu duas fatias de nadegas");   										   
												   }
											   }
											   System.out.println(" Voc� est� sangrando lentamente e imaginando como sua vida seria se tivesse ajudado a garotinha");  
											   System.out.println("Seu ego�smo te matou... ou n�o?");
											   System.out.println("Deseja voltar no tempo? q = sim e = n�o"); 
											   comando = in.nextLine();
											   if(comando.equals("q")) {
												   System.out.println("EU TAMB�M OTARIO AGORA MORRE AI TROX�O NA PR�XIMA MUDA DE ATITUDE AI"); 
												   System.out.println("Aviso: voc� morreu lentamente e com muita dor gritando no meio de um beco com ratos dan�ando ao seu redor com a musica aui mau�, ou foi uma alucin��o e na verdade eles estavam comendo sua carne n�o tenho certeza"); 
											   }else if(comando.equals("e")) {
												   System.out.println("que bom que escolheu essa op��o, ia ser mo humilha��o se voc� falasse sim, s� por isso vou te matar mais rapido"); 
												   System.out.println("voc� morreu mais rapido seu vagabundo odiado por deus"); 
											   }
										   }else {
											   System.out.println("Ta, n�o sei como voc� sobreviveu a isso mas agora chega");
											   System.out.println("Aviso: Deus encarnou em um c�o extremamente gordo e te desceu o cacete (entenda como quiser)");
											   System.out.println("humilhado(a) e derrotado(a) voc� se matou");
											   System.out.println("Deus cagou no seu cadaver e te reviveu com a bosta divina");
											   System.out.println("TUA VIDA � T�O RUIM QUE A BOSTA DE UM CACHORRO TE REVIVE OTARIO(a)");
											   System.out.println("Deus te mandou para marte com um chute depois mijou em voc� e te jogou no sol");
											   System.out.println("Voc� estava prestes a perder o ar e ficar sem consciencia quando sentiu que estava congelando e derrepente come�ou a pegar fogo e se tornar cinzas no espa�o");
											   System.out.println("Aviso: voc� virou poeira espacial misturada com xixi de cachorro gordo divino");
									   }
									   }
								   }else {
									   System.out.println("voc� incrivelmente s� morreu mesmo tchau, criatura patetica");
								   }
							   }
						   }
						}
					}else {
						System.out.println("O inimigo te atacou pelas costas e voc� morreu, reinicie o jogo...");
					}
				}
			} else if(comando.equals("a")) {
				System.out.println("Voc� esta indo para a esquerda");
				System.out.println("Voc� deu de cara com um ork KKKKKK que azarado(a)");
				System.out.println("Oque voc� quer fazer?");
				System.out.println("q = lutar com o ork w = fugir e= se matar r= pedir para deus te ajudar");
				comando = in.nextLine();
				if(comando.equals("q")) {
					System.out.println("Tu achou msm que poderia ganhar de um ork??" + nome + ",TU � DOIDO(a) AT� EU TENHO MEDO DE ORK");
					System.out.println("Morreu...");
					System.out.println("Era t�o jovem :/");
				}else if(comando.equals("w")) {
					System.out.println("Tu n�o fugiu n�o cara...");
					System.out.println("Aviso: voc� deu tr�s passos e o ork arrancou sua cabe�a");
				}else if(comando.equals("e")) {
					System.out.println("Tente a sorte no c�u, essa � a unica vers�o onde voc� n�o vai pro inferno");
					System.out.println("Voc� morreu");
				}else if(comando.equals("r")) {
					System.out.println("MAS QUE OUSADIA � ESSA?");
					System.out.println("vo ajuda n�o morre ai tenho medo de ork");
					System.out.println("Aviso: o ork achou que voc� era uma garota ork e...");
					System.out.println("Aviso: seu anus explodiu e voc� morreu de sangramento");
					System.out.println("Por isso tenho medo de orks parecem completos animais, nem pra agradecer a deus antes da refei��o HAHAHAH");
				}
			}else if( comando.equals("s")){
				System.out.println("Voc� esta indo para tr�s");
			}else if(comando.equals("d")) {
				System.out.println("Voc� esta indo para a direita");
			}
		}
		
	
	
	}
	

}
