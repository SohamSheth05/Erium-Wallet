package io.horizontalsystems.xrateskit2.chartpoint

import io.horizontalsystems.xrateskit2.core.IChartInfoProvider
import io.horizontalsystems.xrateskit2.entities.ChartInfoKey
import io.horizontalsystems.xrateskit2.scheduler.Scheduler

class ChartInfoSchedulerFactory(
        private val manager: ChartInfoManager,
        private val provider: IChartInfoProvider,
        private val retryInterval: Long) {

    fun getScheduler(key: ChartInfoKey): Scheduler {
        return Scheduler(ChartInfoSchedulerProvider(retryInterval, key, provider, manager))
    }
}
