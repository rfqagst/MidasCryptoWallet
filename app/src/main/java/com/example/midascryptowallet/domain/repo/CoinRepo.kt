package com.example.midascryptowallet.domain.repo

import com.example.midascryptowallet.data.remote.dto.CoinDetailDto
import com.example.midascryptowallet.data.remote.dto.CoinDto

interface CoinRepo {
    suspend fun getCoins() : List<CoinDto>
    suspend fun getCoinById(coinId : String) : CoinDetailDto
}