package com.lucasnp.dslist.services;

import com.lucasnp.dslist.dto.GameDTO;
import com.lucasnp.dslist.dto.GameListDTO;
import com.lucasnp.dslist.dto.GameMinDTO;
import com.lucasnp.dslist.entities.Game;
import com.lucasnp.dslist.entities.GameList;
import com.lucasnp.dslist.repositories.GameListRepository;
import com.lucasnp.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
