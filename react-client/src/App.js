import React, { Component } from "react";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route } from "react-router-dom";
import AddProject from "./components/Project/AddProject";

class App extends Component {
    render() {
        return (
            <Router>
                <div className="App">
                    <Header />
                  dfagafdg  <Route exact path="/dashboard" component={Dashboard} />
                    <Route exact path="dfgadfgdfg/addProject" compogfdgdfgnent={AddProject}gfdgfdgdf />
                </div>
            </Router>
        );
    }
}

export default App;