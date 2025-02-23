package org.example.services;

import org.example.models.Perfil;
import org.example.models.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private static final String ARQUIVO_JSON = "usuarios.json";

    public List<Usuario> listarTodos() {
        List<Usuario> usuarios = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(lerArquivoJSON());
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Usuario usuario = converterJSONParaUsuario(jsonObject);
            usuarios.add(usuario);
        }
        return usuarios;
    }

    private String lerArquivoJSON() {
        File file = new File(ARQUIVO_JSON);
        if (!file.exists()) {
            return "[]";
        }
        StringBuilder jsonContent = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                jsonContent.append((char) character);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
            return "[]";
        }
        return jsonContent.length() > 0 ? jsonContent.toString() : "[]";
    }

    private Usuario converterJSONParaUsuario(JSONObject jsonObject) {
        int id = jsonObject.getInt("id");
        String nome = jsonObject.getString("nome");
        String email = jsonObject.getString("email");
        String senha = jsonObject.getString("senha");

        Perfil perfil = null;
        if (jsonObject.has("perfilId")) {
            long perfilId = jsonObject.getLong("perfilId");
            perfil = new Perfil((int) perfilId, "NomePadrão");
        }

        Usuario usuario = new Usuario(id, nome, email, senha, perfil);
        return usuario;
    }

    public Usuario salvar(Usuario usuario) {
        List<Usuario> usuarios = listarTodos();

        boolean idExistente = usuarios.stream().anyMatch(u -> u.getId() == usuario.getId());
        if (usuario.getId() == 0 || idExistente) {
            int novoId = (int) (usuarios.stream().mapToLong(Usuario::getId).max().orElse(0) + 1);
            usuario.setId(novoId);
        }

        usuarios.add(usuario);
        salvarUsuariosEmJSON(usuarios);

        return usuario;
    }

    private void salvarUsuariosEmJSON(List<Usuario> usuarios) {
        JSONArray jsonArray = new JSONArray();
        for (Usuario usuario : usuarios) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", usuario.getId());
            jsonObject.put("nome", usuario.getNome());
            jsonObject.put("email", usuario.getEmail());
            jsonObject.put("senha", usuario.getSenha());
            if (usuario.getPerfil() != null) {
                jsonObject.put("perfilId", usuario.getPerfil());
            }
            jsonArray.put(jsonObject);
        }
        try (FileWriter writer = new FileWriter(ARQUIVO_JSON)) {
            writer.write(jsonArray.toString(4));
        } catch (IOException e) {
            System.err.println("Erro ao salvar no arquivo JSON: " + e.getMessage());
        }
    }

    public void testarJSON() {
        JSONArray array = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("nome", "Teste");
        obj.put("id", 1);
        array.put(obj);
        System.out.println("Teste JSON: " + array.toString());
    }

    public static void main(String[] args) {
        UsuarioService service = new UsuarioService();
        service.testarJSON();
    }
}