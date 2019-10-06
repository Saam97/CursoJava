package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe auxiliar para manipular dados em um Arquivo de texto.
 *
 * @author Samuel
 */
public class Arquivo {

    // Variável auxiliar
    private String[] linha = new String[1000];

    /**
     * Construtor Apenas cria o arquivo .txt.
     */
    public Arquivo() {
        // Criando o arquivo de texto
        try {
            FileOutputStream loja = new FileOutputStream("LojaJogos.txt", true);
            loja.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Erro ao Criar o Arquivo", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que compara o nome de usuário e senha inseridos com os já
     * cadastrados.
     *
     * @param login Nome de usuário
     * @param senha Senha do usuário
     * @return true - sucesso; false - falha
     */
    public boolean verificarLogin(String login, String senha) {
        boolean achou = false;

        for (int j = 0; j < linha.length; j++) {

            if (linha[j + 1] == null) {
                break;
            }

            if (login.equals(linha[j]) && senha.equals(linha[j + 1])) {
                achou = true;
            } else {
                achou = false;
            }
        }
        return achou;
    }

    /**
     * Método que lê os usuários já cadastrados e os armazena na variável auxiliar.
     */
    public void lerArquivoUsuarios() {
        InputStream fluxoEntrada;               // Fluxo de entrada
        InputStreamReader leitorFluxoEntrada;   // Leitor do fluxo de entrada
        BufferedReader bufferEntrada = null;    // Buffer da entrada
        int i = 0;

        try {
            fluxoEntrada = new FileInputStream("usuarios.txt");
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);
            linha[0] = bufferEntrada.readLine();
            i++;
            while (i != 1000) {
                linha[i] = bufferEntrada.readLine();
                i++;
            }

            // Tratamento de Erros
        } catch (FileNotFoundException ex) {
            System.out.println("Erro " + ex.toString());
        } catch (IOException ex) {
            System.out.println("Erro " + ex.toString());
        } finally {
            // Sempre fechar o arquivo após ler/gravar !!
            try {
                bufferEntrada.close();      // Fecha o arquivo
            } catch (IOException ex) {
                System.out.println("Erro " + ex.toString());
            }
        }
    }

    /**
     * Método para salvar o ArrayList de Jogos no arquivo txt.
     * @param jogos ArrayList a ser salvo
     */
    public void jogoSalvar(ArrayList<Jogo> jogos) {
        FileOutputStream fout;
        ObjectOutputStream out;

        try {
            fout = new FileOutputStream("LojaJogos.txt", false);
            out = new ObjectOutputStream(fout);

            out.writeObject(jogos);

            out.close();
            fout.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Método que retorna o ArrayList lido a partir do arquivo txt.
     * @return ArrayList de Jogos Cadastrados
     */
    public ArrayList<Jogo> jogoLer() {
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Jogo> c = new ArrayList<>();

        try {
            fin = new FileInputStream("LojaJogos.txt");
            in = new ObjectInputStream(fin);

            c = (ArrayList<Jogo>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return c;
    }

    /* Usuários */
    
    /**
     * Salva um novo usuário no arquivo
     * Caso o arquivo não exista, ele cria um automaticamente.
     * @param login Login do Usuario
     * @param senha Senha do Usuario
     */
    public void usuarioCriar(String login, String senha) {
        try {
            usuarioLerDados();
        } catch (Exception e) {
            System.out.println("Criando aquivo usuarios.txt ...");
            try {
                OutputStream os = new FileOutputStream("usuarios.txt", true);
            } catch (FileNotFoundException ex) {
                System.out.println("Erro no arquivo lerDadosUsuario" + ex.toString());
            }
        }

        // salva os dados
        usuarioSalvarDados(login, senha);
    }
    
    /**
     * Método que salva um usuário no arquivo de texto.
     * @param login Login do usuário
     * @param senha Senha do usuário
     */
    public void usuarioSalvarDados(String login, String senha) {
        OutputStream fluxoSaida;                // Fluxo de Saida de dados
        OutputStreamWriter geradorFluxoSaida;   // Gerador do Fluxo de Saida
        BufferedWriter bufferSaida = null;      // Buffer da saida

        try {
            fluxoSaida = new FileOutputStream("usuarios.txt", true);   // Cria o arquivo "usuarios.txt" na pasta do projeto
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida); // Todo o fluxo de dados será armazenado neste arquivo
            bufferSaida = new BufferedWriter(geradorFluxoSaida);    // Buffer para o gerador de fluxo

            bufferSaida.write(login);     // Escreve na primeira linha
            bufferSaida.newLine();                          // Insere uma nova linha no arquivo
            bufferSaida.write(senha);     // Escreve na segunda linha
            bufferSaida.newLine();                          // Insere uma nova linha

            // Tratamento de Erros
        } catch (FileNotFoundException ex) {
            System.err.println("Arquivo não encontrado ! método salvarDados()");
        } catch (IOException ex) {
            System.out.println("Erro de Entrada e Saida de dados no arquivo");
        } finally {

            // Sempre fechar o arquivo após ler/gravar !!
            try {
                bufferSaida.close();    // Fecha o arquivo
            } catch (IOException ex) {
                System.err.println("Deu ruim ao fechar o arquivo");
                ex.printStackTrace();
            }
        }

    }
    
    /**
     * Método que lê o arquivo de usuários e os armazena em uma
     * variável auxiliar.
     */
    public void usuarioLerDados() {
        InputStream fluxoEntrada;               // Fluxo de entrada
        InputStreamReader leitorFluxoEntrada;   // Leitor do fluxo de entrada
        BufferedReader bufferEntrada = null;    // Buffer da entrada
        int i = 0;

        try {
            fluxoEntrada = new FileInputStream("usuarios.txt");           // Abre o arquivo "aula12.txt"
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);   // Faz a leitura do arquivo
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);     // Buffer de entrada
            linha[0] = bufferEntrada.readLine();                           // Lê a linha e armazena na variavel auxiliar
            i++;
            while (i != 1000) {                 // Enquanto não chegar no final do arquivo
                linha[i] = bufferEntrada.readLine();   // Pula para a próxima linha
                i++;
                if (linha[i] == null) {
                    break;
                }
            }

            // Tratamento de Erros
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado! Método lerDados()");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            // Sempre fechar o arquivo após ler/gravar !!
            try {
                bufferEntrada.close();      // Fecha o arquivo
            } catch (IOException ex) {
                System.out.println("IOException !");
                ex.printStackTrace();
            }
        }
    }
    
}
