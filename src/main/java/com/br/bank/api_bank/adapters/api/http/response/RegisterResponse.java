package com.br.bank.api_bank.adapters.api.http.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse implements ApiResponse{

    private String message;
}