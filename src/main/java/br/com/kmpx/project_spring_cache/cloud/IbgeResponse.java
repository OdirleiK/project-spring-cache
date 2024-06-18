package br.com.kmpx.project_spring_cache.cloud;

import java.io.Serializable;

public record IbgeResponse(int id, String nome) implements Serializable {
}
