package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\'\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/MarketFavoritesDao;", "", "delete", "", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "getAll", "", "Lio/horizontalsystems/bankwallet/core/storage/FavoriteCoin;", "getCount", "", "insert", "favoriteCoin", "app_debug"})
public abstract interface MarketFavoritesDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.core.storage.FavoriteCoin favoriteCoin);
    
    @androidx.room.Query(value = "DELETE FROM FavoriteCoin WHERE coinType = :coinType")
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM FavoriteCoin")
    public abstract java.util.List<io.horizontalsystems.bankwallet.core.storage.FavoriteCoin> getAll();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM FavoriteCoin WHERE coinType = :coinType")
    public abstract int getCount(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
}