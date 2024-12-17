@file:OptIn(ExperimentalMaterial3AdaptiveApi::class)

package com.calebetadeu.wellfit.core.navigation

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi

//
//@Composable
//fun AdaptiveCoinListDetailPane(
//    modifier: Modifier = Modifier,
//    viewModel: CoinListViewModel = koinViewModel()
//) {
//    val state by viewModel.state.collectAsStateWithLifecycle()
//    val context = LocalContext.current
//    ObserveAsEvents(events = viewModel.events) { event ->
//        when(event) {
//            is CoinListEvent.Error -> {
//                Toast.makeText(
//                    context,
//                    event.error.toString(context),
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        }
//    }
//
//    val navigator = rememberListDetailPaneScaffoldNavigator<Any>()
//    NavigableListDetailPaneScaffold(
//        navigator = navigator,
//        listPane = {
//            AnimatedPane {
//                CoinListScreen(
//                    state = state,
//                    onAction = { action ->
//                        viewModel.onAction(action)
//                        when(action) {
//                            is CoinListAction.OnCoinClick -> {
//                                navigator.navigateTo(
//                                    pane = ListDetailPaneScaffoldRole.Detail
//                                )
//                            }
//                        }
//                    }
//                )
//            }
//        },
//        detailPane = {
//            AnimatedPane {
//                CoinDetailScreen(state = state)
//            }
//        },
//        modifier = modifier
//    )
//}