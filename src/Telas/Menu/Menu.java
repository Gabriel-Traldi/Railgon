package Telas.Menu;

import java.awt.event.*;
import javax.swing.*;

import Repositorio.FactoryLayout;


public class Menu extends JFrame {
	
	// Ordem: Nome do item - Icone do Item - Letra sublinhada
	// Quando passamos nulo, na hora em que dever�amos passar as novas informa��es de item, ele coloca uma linha separadora
	private static String sVagao[] = {"Novo Vag�o", "res/newVagao.gif", null, null, "Vag�es", "res/listaVagao.gif", null};
	private static String sLocomotiva[] = {"Nova Locomotiva", "res/newLocomotiva.gif", null, null, "Locomotivas", "res/listaLocomotiva.gif", null};
	private static String sComposicao[] = {"Nova Composi��o", "res/newComposicao.gif", null, null, "Composi��es", "res/listaComposicao.gif", null};
	private static String sSistema[] = {"Sobre", "res/sobre.gif", null, null, "Sair", "res/listaComposicao.gif", null};
	
	FactoryLayout telas = new FactoryLayout();
	
	public Menu() {
		
		// Construtor passando t�tulo
		super("Railgon");
		
		// Instanciando o menu
		JMenuBar mb = new JMenuBar();
		
		// Ainda n�o sei
		MenuHandler mh = new MenuHandler();
		
		// Adicionando as op�oes no Menu, sendo Nome da op��o, letra sublinhada, conjunto de itens que conter� nela e 
		mb.add(MenuBuilder.newMenu("Vag�o", 'V', sVagao, mh));
		mb.add(MenuBuilder.newMenu("Locomotiva", 'L', sLocomotiva, mh));
		mb.add(MenuBuilder.newMenu("Composi��o", 'C', sComposicao, mh));
		mb.add(MenuBuilder.newMenu("Sistema", 'S', sSistema, mh));
		
		// Setando o menu
		setJMenuBar(mb);
		
		// Setando o tamanho m�ximo da tela
		setExtendedState(this.MAXIMIZED_BOTH);
	}
	
	private class MenuHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String acao = ((JMenuItem) e.getSource()).getText();
			
			switch(acao){
			case "Sair":
				System.exit(0);
			break;
			case "Novo Vag�o":
				System.out.println("Novo Vag�o");
				telas.openAdicionarVagao();
			break;
			case "Vag�es":
				System.out.println("Vag�es");
				telas.openListarVagao();
			break;
			case "Nova Locomotiva":
				System.out.println("Nova Locomotiva");
				telas.openAdicionarLocomotiva();
			break;
			case "Locomotivas":
				System.out.println("Locomotivas");
				telas.openListarLocomotiva();
			break;
			case "Nova Composi��o":
				System.out.println("Nova Composi��o");
				telas.openAdicionarComposicao();
			break;
			case "Composi��es":
				System.out.println("Composi��es");
				telas.openListarComposicao();
			break;
			case "Sobre":
				System.out.println("Sobre");
				telas.openSobre();
			break;
			default:
				System.err.print("Osh");
			break;
			}
				
		}
	}

	
}
