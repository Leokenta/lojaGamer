package org.example.Services;

import org.example.Entities.Contato;
import org.example.Entities.Fornecedor;
import org.example.dto.FornecedorDTO;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
    public Fornecedor update(Long id, FornecedorDTO objDto) {
        try {
            Fornecedor entity = findByid(id);

            entity.setRazaoSocial(objDto.getRazaoSocial());
            entity.setNomeFantasia(objDto.getnomeFantasia());
            entity.setCnpj(objDto.getCnpg());
            entity.setStatus(objDto.getStatus());

            Contato contato = entity.getContatos().get(0);
            contato.setNumero(objDto.getNumero());
            contato.setEmail(objDto.getEmail()  );

        }
    }
}
