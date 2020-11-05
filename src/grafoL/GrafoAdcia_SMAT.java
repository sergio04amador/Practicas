/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoL;
import listaGenerica.*;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author sergi
 */
public class GrafoAdcia_SMAT {
    int numVerts;
    static int maxVerts = 20;
    VerticeAdy [] tablAdc;
            
    public GrafoAdcia_SMAT(int mx)
    {
        tablAdc = new VerticeAdy[mx];
        numVerts = 0;
        maxVerts = mx;
    }
               public GrafoAdcia_SMAT()
               {
                   this(maxVerts);
               }
    public int numeroDeVertices()
    {
        return numVerts;
    }
    public VerticeAdy[] vertices()
    {
        return tablAdc;
    }
    //la operacion listaAdyc() devuelve la lista de adyacencia del vertice v
    public Lista listaAdyc(int v) throws Exception
    {
        if (v < 0 || v >= numVerts)
            throw new Exception(" Vertice fuera de rango ");
        return tablAdc[v].lad;
    }
    public void nuevoVertice (String nom)
    {
        boolean esta = numVertice(nom) >= 0;
        if (!esta)
        {
            VerticeAdy v = new VerticeAdy(nom);
            v.asigVert(numVerts);
            tablAdc [numVerts++] = v;
        }
    }
    //busca el vertice en la tabla, devuelve -1 si no lo encuentra
    public int numVertice(String nm)
    {
        VerticeAdy v = new VerticeAdy(nm);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;)
        {
            encontrado = tablAdc [i].equals(v);
            if (!encontrado) i++;
        }
        return (i < numVerts) ? i : -1 ;
    }
    public void nuevoArco(String a, String b) throws Exception
    {
        if (!adyacente(a, b))
                {
                    int va = numVertice(a);
                    int vb = numVertice(b);
                    if (va < 0 || vb < 0)
                    throw new Exception("Vertice no existe");
                     Arco ab = new Arco(vb);
                     tablAdc[va].lad.insertarCabezaLista(ab);
                }
       }
    boolean adyacente(String a, String b) throws Exception
    {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb <0) throw new Exception ("Vertice no existe");
        if (tablAdc[va].lad.buscarLista(new Arco(vb)) != null)
            return true;
        else
            return false;
    }
    boolean adyacente(int va, int vb) throws Exception
    {
        if (va < 0 || vb <0) throw new Exception ("Vertice no existe");
        if (tablAdc[va].lad.buscarLista(new Arco(vb)) != null)
            return true;
        else
            return false;
    }
    public void borrarArco(String a, String b) throws Exception
    {
       int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        Arco ab = new Arco(vb);
        tablAdc[va].lad.eliminar(ab);
    }
    static void printGraph(GrafoAdcia_SMAT adj)
    {
        System.out.println("\n\nVertices en listas de adyacencia");
        for (int i = 0; i < adj.tablAdc.length; i++)
        {
            ListaIterador list = new ListaIterador(adj.tablAdc[i].lad);
            Arco n;
            System.out.println("Lista "+adj.tablAdc[i].nombre);
            while(list.existe()!=null) 
            {
                n = (Arco) list.datos();
                System.out.println(" -> ");
                if (n!=null)
                    System.out.println(" "+adj.tablAdc[n.destino]);
                list.siguiente();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        String v, w;
        int nm;
        try {
            int n;
            System.out.println("Numero de nodos: ");
            n = Integer.parseInt(entrada.readLine());
            GrafoAdcia_SMAT gra = new GrafoAdcia_SMAT(n);
             System.out.println("Lista de " + n + " vertices");
             for (int i = 1; i <= n; i++)
             {
                 v =  entrada.readLine();
                 gra.nuevoVertice(v);
             }
              System.out.println("Arcos, pares de vertices separados por un espacio");
              boolean fin = false;
              do {
                  StringTokenizer r;
                  r = new StringTokenizer(entrada.readLine());
                  v = r.nextToken();
                  if (! v.equalsIgnoreCase("fin"))
                  {
                      w = r.nextToken();
                      gra.nuevoArco(v, w);
                      //gfra.nuevoArco(w, v ); //al ser grafo no dirigido
                  }
                  else fin = true;
              } while (!fin);
               System.out.println("Vertices del grafo");
               VerticeAdy [] vs = new VerticeAdy[n];
               vs = gra.vertices();
               for (int i = 0; i < n; i++)
                    System.out.println(vs[i] + " \n");
               do {
                    System.out.println("    1.- Mostrar Grafo\n");
                    System.out.println("    2.- Añadir arco\n"); 
                    System.out.println("    3.- Borrar Arco\n");
                    System.out.println("    4.- Vertices adyacentes\n");
                    System.out.println("    6.- Salir");
                    do 
                        nm = Integer.parseInt(entrada.readLine());
                    while(nm < 1 || nm > 5);
                    if (nm == 1)
                    {
                        GrafoAdcia_SMAT.printGraph(gra);
                    }
                    else if (nm == 2)
                    {
                        try 
                        {
                         System.out.println("Arcos, pares de vertices separados por un espacio");
                         StringTokenizer r;
                         r = new StringTokenizer(entrada.readLine());
                         v = r.nextToken();
                         w = r.nextToken();
                         gra.nuevoArco(v, w);
                         //gra.nuevoArco(w, v); // al ser grafo no dirigido
                        } catch (Exception e) {
                             System.out.println(e);
                        }
                    }
                    else if (nm == 3)
                    {
                        try{
                         System.out.println("Arcos a eliminar, pares de vertices separados por un espacio");
                         StringTokenizer r;
                         r = new StringTokenizer(entrada.readLine());
                         v = r.nextToken();
                         w = r.nextToken();
                         gra.borrarArco(v, w);
                    } catch (Exception e){
                             System.out.println(e);
                            }
               }
               else if (nm == 4)
                    {
                       try{
                       String ady = " ";
                         System.out.println("Vertices a comparar, pares de vertices separados por un espacio");
                         StringTokenizer r;
                         r = new StringTokenizer(entrada.readLine());
                         v = r.nextToken();
                         w = r.nextToken();
                       if (gra.adyacente(v, w)) ady="si"; else ady="no";
                       System.out.println("Los vertices "+v+ " "+ady+" son adyacentes");
                       } catch (Exception e) {
                       System.out.println(e);
                       }
                    }
        } while (nm != 5);
    }
    catch (Exception e) {
    System.out.println(" Error en la entrada del grafo "+e);
}
    }
}


























