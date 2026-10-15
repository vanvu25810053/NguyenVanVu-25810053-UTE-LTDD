package com.example.dessertclicker.ui.test

import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.ui.DessertViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class DessertViewModelTest {
    private val viewModel = DessertViewModel()

    @Test
    fun dessertViewModel_Initialization_UiStateLoaded() {
        val dessertUiState = viewModel.uiState.value
        val firstDessert = Datasource.dessertList.first()

        assertEquals(0, dessertUiState.revenue)
        assertEquals(0, dessertUiState.dessertsSold)
        assertEquals(firstDessert.price, dessertUiState.currentDessertPrice)
        assertEquals(firstDessert.imageId, dessertUiState.currentDessertImageId)
    }

    @Test
    fun dessertViewModel_DessertClicked_RevenueAndDessertsSoldUpdated() {
        var currentUiState = viewModel.uiState.value
        val initialDessertPrice = currentUiState.currentDessertPrice

        viewModel.onDessertClicked()

        currentUiState = viewModel.uiState.value
        assertEquals(1, currentUiState.dessertsSold)
        assertEquals(initialDessertPrice, currentUiState.revenue)
    }

    @Test
    fun dessertViewModel_DessertClicked_NextDessertShownWhenThresholdReached() {
        // Donut threshold: startProductionAmount = 5
        val donutDessert = Datasource.dessertList[1]

        repeat(5) {
            viewModel.onDessertClicked()
        }

        val currentUiState = viewModel.uiState.value
        assertEquals(5, currentUiState.dessertsSold)
        assertEquals(donutDessert.imageId, currentUiState.currentDessertImageId)
        assertEquals(donutDessert.price, currentUiState.currentDessertPrice)
    }
}
