package com.list;

import java.util.ArrayList;
import java.util.List;

public class NewsRepository {
    public List<News> getNewsList() {
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("Estrela de Senhor dos Aneis Viciada?",
                "Um novo lado do personagem Gollum é revelado!",
                R.drawable.drunkgolumn,
                "Em uma surpreendente reviravolta, foi descoberto que Gollum, um dos personagens mais icônicos da trilogia Senhor dos Anéis, está viciado em uma nova substância misteriosa. Especialistas discutem os impactos desse vício na história e no futuro da Terra Média."));

        newsList.add(new News("Pikachu chega com novo golpe na praça!",
                "O Pokémon se envolve no submundo do crime!",
                R.drawable.pikachuagiota,
                "Em uma revelação chocante, Pikachu foi associado a um esquema de agiotagem, enganando treinadores e cidadãos com promessas de poderosos golpes em troca de dinheiro. As autoridades estão em alerta, tentando descobrir a extensão do envolvimento do famoso Pokémon em atividades ilegais, enquanto fãs se perguntam como isso afetará sua imagem."));

        newsList.add(new News("Estrela do filme Rio, Ganha torneio de Skate no Rio.",
                "Uma vitória emocionante nas ruas cariocas!",
                R.drawable.skatebird,
                "O famoso pássaro do filme 'Rio' conquistou o primeiro lugar em um torneio de skate realizado no Rio de Janeiro. A competição atraiu skatistas de todo o Brasil, mas a estrela mostrou que ainda tem o que é preciso para vencer. Veja os melhores momentos da competição!"));

        newsList.add(new News("Novo casting para o filme do He Man",
                "Expectativa cresce com a nova seleção de atores!",
                R.drawable.terryheman,
                "O filme do He Man está prestes a ganhar vida novamente, e um novo casting foi anunciado. A expectativa está alta para saber quem interpretará os personagens icônicos da franquia. Descubra quem são os novos talentos que podem dar vida ao Mundo de Eternia!"));

        return newsList;
    }

}
