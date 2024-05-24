// import React from "react";
import ReactDOM from "react-dom/client";
import { Provider } from "react-redux";
import { QueryClientProvider, QueryClient } from "react-query";

import App from "./App.jsx";
import GlobalStyles from "./components/GlobalStyles";
import store from "./store";

const queryClient = new QueryClient({
   defaultOptions: {
      queries: {
         refetchOnWindowFocus: false,
      },
   },
});

ReactDOM.createRoot(document.getElementById("root")).render(
   // <React.StrictMode>
   <Provider store={store}>
      <QueryClientProvider client={queryClient}>
         <GlobalStyles>
            <App />
         </GlobalStyles>
      </QueryClientProvider>
   </Provider>,
   // </React.StrictMode>,
);
